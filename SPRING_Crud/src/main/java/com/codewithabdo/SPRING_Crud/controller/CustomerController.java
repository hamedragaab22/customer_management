package com.codewithabdo.SPRING_Crud.controller;

import com.codewithabdo.SPRING_Crud.entity.Customer;
import com.codewithabdo.SPRING_Crud.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apo")

@CrossOrigin("*")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping("/customer")
    public Customer postCustomer(@RequestBody Customer customer) {
        return customerService.postCustomer(customer);
    }
}
