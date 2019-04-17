package com.springboot.restfull.service;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.springboot.restfull.model.Employee;

public interface EmployeeService {
	
//	Employee addEmployee(Employee employee);
	Employee getById(Long id);
	public Map<String,Object> addEmployee(Employee employee,HttpServletResponse response);

}
