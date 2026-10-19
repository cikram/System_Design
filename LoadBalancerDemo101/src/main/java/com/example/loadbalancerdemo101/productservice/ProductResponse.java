package com.example.loadbalancerdemo101.productservice;

public record ProductResponse(
        String productId,
        String name,
        String servedByInstance,
        int requestCountOnInstance
) {}