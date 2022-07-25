package com.spring.ORM.SpringFrameworkORM.Dao;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.ORM.SpringFrameworkORM.entities.Employee;

public class EmployeeDao {

	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int save(Employee emp) {
		return (Integer) this.hibernateTemplate.save(emp);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

}
