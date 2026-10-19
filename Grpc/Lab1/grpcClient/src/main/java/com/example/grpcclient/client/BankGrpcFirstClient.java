package com.example.grpcclient.client;

import com.example.grpcclient.stubs.BankServiceGrpc;
import com.example.grpcclient.stubs.ConvertCurrencyRequest;
import com.example.grpcclient.stubs.ConvertCurrencyResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class BankGrpcFirstClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 5555)
                .usePlaintext()
                .build();

        BankServiceGrpc.BankServiceBlockingStub blockingStub =
                BankServiceGrpc.newBlockingStub(managedChannel);

        ConvertCurrencyRequest request = ConvertCurrencyRequest.newBuilder()
                .setCurrencyFrom("MAD")
                .setCurrencyTo("Euro")
                .setAmount(15425)
                .build();

        ConvertCurrencyResponse response = blockingStub.convert(request);
        System.out.println(response);
    }
}