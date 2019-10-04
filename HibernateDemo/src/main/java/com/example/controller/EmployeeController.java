package com.example.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;

	@GetMapping("/employee")
	public List<Employee> getAllEmployee() {
		
		return empService.getAllEmployee();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") String employeeId) {
		
		System.out.println("id    "+employeeId);
		
		return empService.getEmployeeById(1L);
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(Employee employee) {
		
		
		employee.setEmployeeDob(new Date());
		employee.setEmployeeDoj(new Date());
		
		return empService.addEmployee(employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployeeById(@PathVariable("id") Long employeeId) {
		
		return empService.deleteEmployeeById(employeeId);
	}
	
}
