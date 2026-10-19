package com.example.customer_service.mappers;

import com.customer.service.customerservice.stub.CustomerServiceOuterClass;
import com.example.customer_service.entities.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public CustomerServiceOuterClass.Customer fromCustomer(Customer customer) {
        return modelMapper.map(customer, CustomerServiceOuterClass.Customer.Builder.class).build();
    }

    public Customer fromGrpcCustomerRequest(CustomerServiceOuterClass.CustomerRequest customerRequest) {
        return modelMapper.map(customerRequest, Customer.class);
    }
}