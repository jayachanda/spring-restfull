package com.springboot.restfull.controller;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restfull.model.Employee;
import com.springboot.restfull.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
//	@RequestMapping(value="/addEmployee",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
//	public ResponseEntity<Employee> addEmployees(@RequestBody Employee employee,HttpServletResponse response){
//		employee=(Employee) employeeService.addEmployee(employee,response);
//		return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
//	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public Map<String,Object> addEmployee(@RequestBody Employee employee,HttpServletResponse response){
		Map<String,Object> map= employeeService.addEmployee(employee,response);
		return map;
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id){
		Employee employee=employeeService.getById(id);
		if(employee==null){
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	
	@RequestMapping(value="/hello",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getMessage(){
		return new ResponseEntity<String>("Hello world.!",HttpStatus.OK);
	}
	

}
