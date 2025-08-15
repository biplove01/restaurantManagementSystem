package com.crudSE.demo.controller;

import com.crudSE.demo.service.CustomerService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
  
  private final CustomerService customerService;
  
  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }
}
