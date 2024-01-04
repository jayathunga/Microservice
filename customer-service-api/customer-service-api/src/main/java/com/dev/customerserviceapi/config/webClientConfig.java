package com.dev.customerserviceapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class webClientConfig {

    @Value("${order.service.url}")
    private String orderServiceUrl;
    @Bean
    public WebClient webClient(){
       WebClient webClient=WebClient.builder().baseUrl(orderServiceUrl).build();
      return webClient;
    }
}
