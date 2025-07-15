package com.codewithabdo.SPRING_Crud.service;

import com.codewithabdo.SPRING_Crud.entity.Customer;
import com.codewithabdo.SPRING_Crud.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer postCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer>getAllCustomers(){
        return customerRepository.findAll();
    }
}
