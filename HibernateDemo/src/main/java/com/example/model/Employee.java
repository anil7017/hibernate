package com.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	public Employee() {

	}
	public Employee(Long employeeId, String employeeName, Date employeeDob, Date employeeDoj,
			String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDob = employeeDob;
		this.employeeDoj = employeeDoj;
		this.employeeDepartment = employeeDepartment;
	}



	@Id
	@GeneratedValue
	@Column(name = "employee_id")
	private Long employeeId;
	
	@Column(name = "employee_name")
	private String employeeName;

	@Column(name = "employee_dob")
	private Date employeeDob;

	@Column(name = "employee_doj")
	private Date employeeDoj;

	@Column(name = "employee_department")
	private String employeeDepartment;

	
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getEmployeeDob() {
		return employeeDob;
	}

	public void setEmployeeDob(Date employeeDob) {
		this.employeeDob = employeeDob;
	}

	public Date getEmployeeDoj() {
		return employeeDoj;
	}

	public void setEmployeeDoj(Date employeeDoj) {
		this.employeeDoj = employeeDoj;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDob=" + employeeDob
				+ ", employeeDoj=" + employeeDoj + ", employeeDepartment=" + employeeDepartment + "]";
	}

	

}
