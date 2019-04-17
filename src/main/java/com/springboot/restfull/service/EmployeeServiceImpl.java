package com.springboot.restfull.service;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.restfull.model.Employee;
import com.springboot.restfull.repositories.EmployeeRepository;
import com.springboot.restfull.util.ResposeMessageUtil;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ResposeMessageUtil resposeMessageUtil;
	
	@Override
	public Map<String, Object> addEmployee(Employee employee, HttpServletResponse response) {
		String status="Success";
		String Message="Addeded Succesfully";
		int statusCode=200;
		try{
			employeeRepository.save(employee);
		}catch(Exception ex){
			ex.printStackTrace();
			status="Fail";
			Message="Fail to added";
			statusCode=500;
		}
		return resposeMessageUtil.formatResposneMessage(status, Message, employee, statusCode);
	}

	@Override
	public Employee getById(Long id) {
		return employeeRepository.findById(id);
	}
	
}
