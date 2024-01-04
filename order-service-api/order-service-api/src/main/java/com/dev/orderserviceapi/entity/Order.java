package com.dev.orderserviceapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_table")
public class Order {

    @Id
    @Column(name = "order_id")
    private Long orderId;

    private Long customerId;

    private Long productId;

    private double cost;

    public Order(Long orderId, Long customerId, Long productId, double cost) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.productId = productId;
        this.cost = cost;
    }

    public Order(){

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
