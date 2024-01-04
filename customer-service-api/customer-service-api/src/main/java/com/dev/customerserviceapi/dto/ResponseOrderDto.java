package com.dev.customerserviceapi.dto;

import java.util.List;

public class ResponseOrderDto {

    List<OrderDto> orderDtoList;

    public ResponseOrderDto(List<OrderDto> orderDtoList) {
        this.orderDtoList = orderDtoList;
    }

    public ResponseOrderDto(){

    }

    public List<OrderDto> getOrderDtoList() {
        return orderDtoList;
    }

    public void setOrderDtoList(List<OrderDto> orderDtoList) {
        this.orderDtoList = orderDtoList;
    }
}
