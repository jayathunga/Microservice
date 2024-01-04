package com.dev.customerserviceapi.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


public class CustomerDto {
    private Long id;
    private String name;
    private String address;
    private double salary;

    public CustomerDto(Long id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }
    public CustomerDto(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
