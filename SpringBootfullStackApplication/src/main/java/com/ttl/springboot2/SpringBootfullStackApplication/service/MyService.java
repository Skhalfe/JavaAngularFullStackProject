package com.ttl.springboot2.SpringBootfullStackApplication.service;

import java.util.List;
import java.util.Optional;



import com.ttl.springboot2.SpringBootfullStackApplication.model.Employee;



public interface MyService {



public List<Employee> getEmployees();
public Optional<Employee> getEmployeeById(int empid);
public Employee addNewEmployee(Employee emp);
public Employee updateEmployee(Employee emp);
public void deleteEmployeeById(int empid);
public void deleteAllEmployees();
}