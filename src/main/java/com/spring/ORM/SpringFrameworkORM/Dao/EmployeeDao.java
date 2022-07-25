package com.spring.ORM.SpringFrameworkORM.Dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.ORM.SpringFrameworkORM.entities.Employee;

public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int save(Employee emp) {
		return (Integer) this.hibernateTemplate.save(emp);
	}

	public Employee getEmployee(int empId) {
		return hibernateTemplate.get(Employee.class, empId);
	}

	public List<Employee> getAllEmployees() {
		return hibernateTemplate.loadAll(Employee.class);
	}

	@Transactional
	public void deleteEmployee(int empId) {
		Employee emp = hibernateTemplate.get(Employee.class, empId);
		hibernateTemplate.delete(emp);
	}

	@Transactional
	public void updateEmployee(Employee emp) {
		hibernateTemplate.update(emp);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
