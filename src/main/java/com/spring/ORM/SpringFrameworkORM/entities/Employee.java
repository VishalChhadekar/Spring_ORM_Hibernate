package com.spring.ORM.SpringFrameworkORM.entities;

import javax.persistence.*;

@Entity
@Table(name = "EmployeeDetails")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "Emp_ID")
	private int empId;
	@Column(name = "Emp_Name")
	private String empName;
	@Column(name = "Emp_City")
	private String empCity;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

}
