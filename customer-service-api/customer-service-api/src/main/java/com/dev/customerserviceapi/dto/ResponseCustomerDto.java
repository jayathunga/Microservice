package com.dev.customerserviceapi.dto;

public class ResponseCustomerDto {

    private CustomerDto customerData;

    private ResponseOrderDto orderData;

    public ResponseCustomerDto(CustomerDto customerData, ResponseOrderDto orderData) {
        this.customerData = customerData;
        this.orderData = orderData;
    }

    public ResponseCustomerDto(){

    }

    public CustomerDto getCustomerData() {
        return customerData;
    }

    public void setCustomerData(CustomerDto customerData) {
        this.customerData = customerData;
    }

    public ResponseOrderDto getOrderData() {
        return orderData;
    }

    public void setOrderData(ResponseOrderDto orderData) {
        this.orderData = orderData;
    }
}
