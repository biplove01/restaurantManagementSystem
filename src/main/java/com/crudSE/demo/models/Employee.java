package com.crudSE.demo.models;

import com.crudSE.demo.models.enums.RoleStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
@Entity
public class Employee {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  
  @OneToMany(fetch = FetchType.EAGER, cascade = {
      CascadeType.ALL,
  })
  @JoinTable(name="employee_roles", joinColumns = @JoinColumn(name = "employee_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
  private List<Role> roles = new ArrayList<>();
  
  
}


