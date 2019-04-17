package com.springboot.restfull;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.springboot.restfull.model.Employee;
import com.springboot.restfull.repositories.EmployeeRepository;
import com.springboot.restfull.service.EmployeeServiceImpl;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {
	
	@Mock
	private EmployeeRepository employeeRepository;
	
	@InjectMocks
	private EmployeeServiceImpl employeeService;
	
	MockHttpServletResponse response=new MockHttpServletResponse();
	
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void addEmployeeTest() throws Exception{
		Employee employee=new Employee();
		employee.setFirstname("Shivaraj");
		employee.setLastname("S");
		employee.setDesgination("Electrical Enginner");
		employee.setSalary(25000);
		
		when(employeeRepository.save(any(Employee.class))).thenReturn(employee);
		
		Map<String,Object> map=employeeService.addEmployee(employee, response);
		Employee actual=(Employee)map.get("data");
		System.out.println("FirstName....."+actual.getFirstname());
		assertEquals("Shivaraj", actual.getFirstname());
		

	}
}
