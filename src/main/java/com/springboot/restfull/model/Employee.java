package com.springboot.restfull.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee implements Serializable,Comparable<Employee> {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String firstname;
	private String lastname;
	private String desgination;
	private Integer salary;
	//getter and setter
	

	public Employee() {
		super();
	}

	public Employee(Long id, String firstname, String lastname, String desgination, Integer salary) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.desgination = desgination;
		this.salary = salary;
	}

	public Employee(String firstname, String lastname, String desgination, Integer salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.desgination = desgination;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDesgination() {
		return desgination;
	}

	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
