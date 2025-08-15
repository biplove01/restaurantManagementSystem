package com.crudSE.demo.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class OrderList {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @OneToMany(mappedBy = "orderList", cascade = CascadeType.ALL)
  private List<OrderItem> orderItems;
  
  
  @ManyToOne
  private Customer customer;
}
