package com.crudSE.demo.service;

import com.crudSE.demo.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
  
  private final CustomerRepository customerRepository;
  
  public CustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }
  
  
  
  
}
