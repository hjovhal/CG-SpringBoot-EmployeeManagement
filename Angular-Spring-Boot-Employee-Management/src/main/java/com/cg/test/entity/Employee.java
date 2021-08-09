package com.cg.test.entity;

import lombok.Data;

@Data
public class Employee {

	private Integer empId;
	private String empName;
	private String email;
	private String location;
	
	public Employee() {
		
	}

	public Employee(int empId, String empName, String email, String location) {
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.location = location;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
