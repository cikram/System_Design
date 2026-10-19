package com.example.grpcserver.service;

import com.example.grpcserver.stubs.BankServiceGrpc;
import com.example.grpcserver.stubs.ConvertCurrencyRequest;
import com.example.grpcserver.stubs.ConvertCurrencyResponse;
import io.grpc.stub.StreamObserver;

public class BankGrpcService extends BankServiceGrpc.BankServiceImplBase {

    @Override
    public void convert(ConvertCurrencyRequest request,
                        StreamObserver<ConvertCurrencyResponse> responseObserver) {
        String currencyFrom = request.getCurrencyFrom();
        String currencyTo = request.getCurrencyTo();
        double amount = request.getAmount();

        ConvertCurrencyResponse response = ConvertCurrencyResponse.newBuilder()
                .setCurrencyFrom(currencyFrom)
                .setCurrencyTo(currencyTo)
                .setAmount(amount)
                .setResult(amount * 12.14)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}