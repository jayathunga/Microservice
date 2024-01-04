package com.dev.customerserviceapi.controller;

import com.dev.customerserviceapi.dto.CustomerDto;
import com.dev.customerserviceapi.dto.OrderDto;
import com.dev.customerserviceapi.service.CustomerService;
import com.dev.customerserviceapi.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public ResponseEntity<StandardResponse>createCustomer(@RequestBody CustomerDto customerDto){
        customerService.createCustomer(customerDto);
        return new ResponseEntity<>(
                new StandardResponse(201,"customer saved!",customerDto),
                HttpStatus.CREATED
        );
    }

    @GetMapping("/findById/{id}")
    public ResponseEntity<StandardResponse>findCustomerById(@PathVariable Long id){
        return new ResponseEntity<>(
                new StandardResponse(200,"customer found!",customerService.findCustomerById(id)),
                HttpStatus.CREATED
        );
    }


}
