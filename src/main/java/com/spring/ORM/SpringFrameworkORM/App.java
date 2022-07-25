package com.spring.ORM.SpringFrameworkORM;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.ORM.SpringFrameworkORM.Dao.EmployeeDao;
import com.spring.ORM.SpringFrameworkORM.entities.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Program Initiated!");
		ApplicationContext con = new ClassPathXmlApplicationContext("Config.xml");
		EmployeeDao employeeDao = con.getBean("employeeDao", EmployeeDao.class);
		// SAVE
//		Employee emp = new Employee();
//        emp.setEmpName("SandMan");
//        emp.setEmpCity("Hevan");
//        int save = employeeDao.save(emp);
//        System.out.println("Record inserted: "+ save);

		// READ
//		Employee emp = employeeDao.getEmployee(1);
//		System.out.println(emp.getEmpId());
//		System.out.println(emp.getEmpName());
//		System.out.println(emp.getEmpCity());

		// GET ALL EMPLOYEES
//		List<Employee> empList = employeeDao.getAllEmployees();
//		for (Employee emp : empList) {
//			System.out.println("Emp ID: "+ emp.getEmpId());
//			System.out.println("Emp Name: "+ emp.getEmpName());
//			System.out.println("Emp City: "+ emp.getEmpCity());
//			System.out.println();
//		}
		//DELETE
//		employeeDao.deleteEmployee(4);
//		System.out.println("Employee deleted.");
		
		//UPDATE	
		Employee emp =employeeDao.getEmployee(2);
		emp.setEmpName("Morphious");
		employeeDao.updateEmployee(emp);
		System.out.println("Employee updated");

	}
}











