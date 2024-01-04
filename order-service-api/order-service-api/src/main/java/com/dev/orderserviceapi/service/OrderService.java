package com.dev.orderserviceapi.service;

import com.dev.orderserviceapi.dto.OrderDto;
import com.dev.orderserviceapi.dto.ResponseOrderDto;
import com.dev.orderserviceapi.entity.Order;

import java.util.List;

public interface OrderService {

    public void createOrder(OrderDto orderDto);

    public ResponseOrderDto loadOrdersByCustomer(Long id);
}
