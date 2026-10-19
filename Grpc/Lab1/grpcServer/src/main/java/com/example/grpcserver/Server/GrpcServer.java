package com.example.grpcserver.Server;

import com.example.grpcserver.service.BankGrpcService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(5555)
                .addService(new BankGrpcService())
                .build();

        server.start();
        System.out.println("Server started on port 5555");
        server.awaitTermination();
    }
}