package com.cg.test.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.test.entity.Employee;
import com.cg.test.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;




@RestController
@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
@RequestMapping("/api")
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		logger.info("Inside EmployeeController getAllEmployees() {} ");
		return employeeService.getAllEmployees();
	}

	@GetMapping("/getAllEmployeesInMap")
	public Map<Integer, Employee> getAllEmployeesInMap() {
		logger.info("Inside EmployeeController getAllEmployeesInMap() {} ");
		return employeeService.getAllEmployeesInMap();
	}

	@GetMapping("/employees/{id}")
	public Employee getEmployeeById(@PathVariable(value = "id") String id) {
		logger.info("Inside EmployeeController getEmployeeById() {} ");
		return employeeService.getEmployeeByEmpId(id);
	}

	@PutMapping("/updateEmployee")
	public void updateEmployee(@RequestBody Employee updateEmployeeDetails) {
		logger.info("Inside EmployeeController updateEmployee() {} ");
		employeeService.updateEmployee(updateEmployeeDetails);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
