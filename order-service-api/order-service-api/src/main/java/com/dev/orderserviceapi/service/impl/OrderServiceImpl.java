package com.dev.orderserviceapi.service.impl;

import com.dev.orderserviceapi.dto.OrderDto;
import com.dev.orderserviceapi.dto.ResponseOrderDto;
import com.dev.orderserviceapi.entity.Order;
import com.dev.orderserviceapi.repo.OrderRepo;
import com.dev.orderserviceapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
   private OrderRepo orderRepo;
    @Override
    public void createOrder(OrderDto orderDto) {
        Order order=new Order(
                orderDto.getOrderId(),orderDto.getCustomerId(),orderDto.getProductId(),orderDto.getCost()
        );
        orderRepo.save(order);
    }

    @Override
    public ResponseOrderDto loadOrdersByCustomer(Long id) {
        List<Order> orders=orderRepo.getOrdersByCustomer(id);
        List<OrderDto>orderDtos=new ArrayList<>();
        for(Order val:orders){
            orderDtos.add(new OrderDto(val.getOrderId(),val.getCustomerId(),val.getProductId(),val.getCost()));
        }
        return new ResponseOrderDto(orderDtos);
    }
}
