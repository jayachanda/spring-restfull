package com.springboot.restfull.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.restfull.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {
	
	public Employee findById(long id);

}
