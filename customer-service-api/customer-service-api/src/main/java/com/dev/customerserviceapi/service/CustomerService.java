package com.dev.customerserviceapi.service;

import com.dev.customerserviceapi.dto.CustomerDto;
import com.dev.customerserviceapi.dto.ResponseCustomerDto;

public interface CustomerService {
    public void createCustomer(CustomerDto customerDto);

    public ResponseCustomerDto findCustomerById(Long id);

}
