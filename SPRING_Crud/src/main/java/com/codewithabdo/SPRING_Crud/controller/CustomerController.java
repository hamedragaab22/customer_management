package com.codewithabdo.SPRING_Crud.controller;

import com.codewithabdo.SPRING_Crud.entity.Customer;
import com.codewithabdo.SPRING_Crud.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        Customer customer=customerService.getCustomerById(id);
        if (customer==null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(customer);
    }
    @PutMapping("/customer/{id}")

    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id,@RequestBody Customer customer) {
        Customer existingCustomer=customerService.getCustomerById(id);
        if (existingCustomer==null){
            return ResponseEntity.notFound().build();
        }
        existingCustomer.setName(customer.getName());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setPhone(customer.getPhone());
        Customer updateeCustomer=customerService.updateCustomer(existingCustomer);
        return ResponseEntity.ok(customer);
    }
}
