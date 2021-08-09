package com.cg.test.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.test.entity.Employee;
import com.cg.test.repository.EmployeeDataSource;

@Service
public class EmployeeService {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	private EmployeeDataSource employeeDataSource;
	
	public List<Employee> getAllEmployees() {
		
		logger.info("Inside EmployeeService getAllEmployees() {} ");
		
		return employeeDataSource.getEmpList();
	}
	
	public Map<Integer, Employee> getAllEmployeesInMap(){
		
		logger.info("Inside EmployeeService getAllEmployeesInMap() {} ");
		
		return employeeDataSource.getEmployeesInMap();
	}

	public void updateEmployee(Employee updateEmployeeDetails) {
		
		logger.info("Inside EmployeeService updateEmployee() {} ");

		Map<Integer, Employee> employeesInMap = employeeDataSource.getEmployeesInMap();

		Employee employee = employeesInMap.get(updateEmployeeDetails.getEmpId());
		employee.setEmail(updateEmployeeDetails.getEmail());
		employee.setEmpName(updateEmployeeDetails.getEmpName());
		employee.setLocation(updateEmployeeDetails.getLocation());

		employeesInMap.put(updateEmployeeDetails.getEmpId(), employee);

		employeeDataSource.setEmpMap(employeesInMap);
	}
	
	public Employee getEmployeeByEmpId(String employeeId) {
		
		logger.info("Inside EmployeeService getEmployeeByEmpId() {} ");
		
		Map<Integer, Employee> empMap = employeeDataSource.getEmpMap();
		
		return empMap.get(Integer.valueOf(employeeId));
	}

	
	
	

}


















