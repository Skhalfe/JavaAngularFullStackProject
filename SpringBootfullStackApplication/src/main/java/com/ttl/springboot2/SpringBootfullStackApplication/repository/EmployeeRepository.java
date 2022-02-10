package com.ttl.springboot2.SpringBootfullStackApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.ttl.springboot2.SpringBootfullStackApplication.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}