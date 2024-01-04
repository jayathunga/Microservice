package com.dev.customerserviceapi.config;

import feign.Feign;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;

@LoadBalancerClient(value = "order-service-api")
public class OrderLoadBalancerConfig {

    public Feign.Builder feBuilder(){
        return Feign.builder();
    }
}
