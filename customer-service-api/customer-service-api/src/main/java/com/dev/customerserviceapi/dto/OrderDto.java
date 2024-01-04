package com.dev.customerserviceapi.dto;

public class OrderDto {
    private Long orderId;

    private Long customerId;

    private Long productId;

    private double cost;

    public OrderDto(Long orderId, Long customerId, Long productId, double cost) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productId = productId;
        this.cost = cost;
    }

    public OrderDto(){

    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}