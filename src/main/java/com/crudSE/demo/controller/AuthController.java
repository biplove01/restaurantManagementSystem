package com.crudSE.demo.controller;

import com.crudSE.demo.models.Employee;
import com.crudSE.demo.repositories.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
  private final EmployeeRepository employeeRepository;
  
  AuthController(EmployeeRepository employeeRepository){
    this.employeeRepository = employeeRepository;
  }


  @PostMapping("/login")
  public ResponseEntity<?> login(){
   return new ResponseEntity<String>("login successful", HttpStatus.OK);
  }
  
}
