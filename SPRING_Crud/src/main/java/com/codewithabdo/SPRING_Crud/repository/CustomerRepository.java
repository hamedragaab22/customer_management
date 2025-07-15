package com.codewithabdo.SPRING_Crud.repository;

import com.codewithabdo.SPRING_Crud.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
