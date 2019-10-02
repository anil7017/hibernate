package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empRepository;

	@Override
	public List<Employee> getAllEmployee() {

		return empRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long employeeId) {

		return empRepository.getOne(employeeId);

	}

	@Override
	public Employee addEmployee(Employee employee) {

		return empRepository.save(employee);
	}

	@Override
	public String deleteEmployeeById(Long employeeId) {

		empRepository.deleteById(employeeId);

		return employeeId.toString();
	}

}
