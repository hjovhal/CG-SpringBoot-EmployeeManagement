package com.cg.test.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.ComponentScan;

import com.cg.test.entity.Employee;

@ComponentScan
public class EmployeeDataSource {

	List<Employee> empList = getAllEmployees();
	Map<Integer, Employee> empMap = getEmployeesInMap();

	public Map<Integer, Employee> getEmployeesInMap() {

		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

		for (Employee employee : empList) {
			if (empMap.containsKey(employee.getEmpId())) {
				empMap.put(employee.getEmpId(), employee);
			} else {
				empMap.put(employee.getEmpId(), employee);
			}
		}
		return empMap;
	}

	public List<Employee> getAllEmployees() {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(1001, "Hitesh", "hitesh@g.com", "Navi Mumbai"));
		empList.add(new Employee(1002, "Jitesh", "jitesh@g.com", "Mumbai"));
		empList.add(new Employee(1003, "Mitesh", "mitesh@g.com", "Thane"));
		empList.add(new Employee(1004, "Pritesh", "pritesh@g.com", "Pune"));
		empList.add(new Employee(1005, "Ritesh", "ritesh@g.com", "Delhi"));
		empList.add(new Employee(1006, "Umesh", "umesh@g.com", "Goa"));
		empList.add(new Employee(1007, "Atesh", "atesh@g.com", "Navi Mumbai"));

		return empList;
	}

	public List<Employee> getEmpList() {

		empList.clear();
		for (Integer key : empMap.keySet()) {
			empList.add(empMap.get(key));
		}
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	public Map<Integer, Employee> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(Map<Integer, Employee> empMap) {
		this.empMap = empMap;
	}

}
