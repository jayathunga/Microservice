package com.dev.orderserviceapi.controller;

import com.dev.orderserviceapi.dto.OrderDto;
import com.dev.orderserviceapi.dto.ResponseOrderDto;
import com.dev.orderserviceapi.service.OrderService;
import com.dev.orderserviceapi.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @PostMapping
  public ResponseEntity<StandardResponse>createOrder(@RequestBody OrderDto orderDto){
      orderService.createOrder(orderDto);
      return new ResponseEntity<>(
              new StandardResponse(201,"Order saved!",orderDto),
              HttpStatus.CREATED
      );
  }

    @GetMapping("/getByCustomerId/{id}")
    public ResponseOrderDto findOrderByCustomer(@PathVariable Long id ){
        return orderService.loadOrdersByCustomer(id);
    }
}
