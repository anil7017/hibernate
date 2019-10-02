package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee();
	
	public Employee getEmployeeById(Long employeeId);
	
	public Employee addEmployee(Employee employee);
	
	public String deleteEmployeeById(Long employeeId);

}
