package com.crudSE.demo.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Customer {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  private String name;
  
  @OneToMany(mappedBy = "customer")
  private List<OrderList> orderList;
  
}
