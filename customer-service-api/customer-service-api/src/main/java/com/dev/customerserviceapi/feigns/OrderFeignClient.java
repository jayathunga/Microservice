package com.dev.customerserviceapi.feigns;

import com.dev.customerserviceapi.dto.ResponseOrderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(path = "/api/v1/orders",value = "order-service-api")
public interface OrderFeignClient {

    @GetMapping("/getByCustomerId/{id}")
    public ResponseOrderDto findOrderByCustomer(@PathVariable Long id );
}
