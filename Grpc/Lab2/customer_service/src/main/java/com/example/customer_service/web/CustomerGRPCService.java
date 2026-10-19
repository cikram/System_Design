package com.example.customer_service.web;

import com.customer.service.customerservice.stub.CustomerServiceGrpc;
import com.customer.service.customerservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest;
import com.customer.service.customerservice.stub.CustomerServiceOuterClass.GetCustomersResponse;
import com.customer.service.customerservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest;
import com.customer.service.customerservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse;
import com.customer.service.customerservice.stub.CustomerServiceOuterClass.SaveCustomerRequest;
import com.customer.service.customerservice.stub.CustomerServiceOuterClass.SaveCustomerResponse;
import com.example.customer_service.entities.Customer;
import com.example.customer_service.mappers.CustomerMapper;
import com.example.customer_service.repositories.CustomerRepository;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class CustomerGRPCService extends CustomerServiceGrpc.CustomerServiceImplBase {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void getAllCustomers(GetAllCustomersRequest request,
                                StreamObserver<GetCustomersResponse> responseObserver) {
        var customers = customerRepository.findAll().stream()
                .map(customerMapper::fromCustomer)
                .toList();

        GetCustomersResponse response = GetCustomersResponse.newBuilder()
                .addAllCustomers(customers)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getCustomerById(GetCustomerByIdRequest request,
                                StreamObserver<GetCustomerByIdResponse> responseObserver) {
        customerRepository.findById(request.getCustomerId()).ifPresentOrElse(
                customer -> {
                    responseObserver.onNext(GetCustomerByIdResponse.newBuilder()
                            .setCustomer(customerMapper.fromCustomer(customer))
                            .build());
                    responseObserver.onCompleted();
                },
                () -> responseObserver.onError(Status.NOT_FOUND
                        .withDescription("Customer not found")
                        .asRuntimeException())
        );
    }

    @Override
    public void saveCustomer(SaveCustomerRequest request,
                             StreamObserver<SaveCustomerResponse> responseObserver) {
        Customer customer = customerMapper.fromGrpcCustomerRequest(request.getCustomer());
        Customer saved = customerRepository.save(customer);

        responseObserver.onNext(SaveCustomerResponse.newBuilder()
                .setCustomer(customerMapper.fromCustomer(saved))
                .build());
        responseObserver.onCompleted();
    }
}