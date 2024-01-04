package com.dev.customerserviceapi.service.impl;

import com.dev.customerserviceapi.dto.CustomerDto;
import com.dev.customerserviceapi.dto.OrderDto;
import com.dev.customerserviceapi.dto.ResponseCustomerDto;
import com.dev.customerserviceapi.dto.ResponseOrderDto;
import com.dev.customerserviceapi.entity.Customer;
import com.dev.customerserviceapi.feigns.OrderFeignClient;
import com.dev.customerserviceapi.repo.CustomerRepo;
import com.dev.customerserviceapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private WebClient webClient;

    @Autowired
    private OrderFeignClient orderFeignClient;
    @Autowired
    CustomerRepo customerRepo;
    @Override
    public void createCustomer(CustomerDto customerDto) {
        Customer customer=new Customer(
                customerDto.getId(),customerDto.getName(),customerDto.getAddress(),customerDto.getSalary()
        );
        customerRepo.save(customer);
    }

    @Override
    public ResponseCustomerDto findCustomerById(Long id) {
        Optional<Customer>customer=customerRepo.findById(id);
        if(customer.isEmpty()){
            throw new RuntimeException("Not found!");
        }
        else{
          ResponseOrderDto responseOrderDto=  orderFeignClient.findOrderByCustomer(id);
          CustomerDto customerDto=new CustomerDto(customer.get().getId(),customer.get().getName(),customer.get().getAddress(),
                  customer.get().getSalary());
           return new ResponseCustomerDto(customerDto,responseOrderDto);
        }

    }

    public ResponseOrderDto findOrders(Long id){
       Mono<ResponseOrderDto> orderDtoMono= webClient.get().uri("/getByCustomerId/"+id).retrieve().bodyToMono(ResponseOrderDto.class);
        return orderDtoMono.block();
    }
}
