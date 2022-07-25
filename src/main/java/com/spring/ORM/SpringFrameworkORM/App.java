package com.spring.ORM.SpringFrameworkORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.ORM.SpringFrameworkORM.Dao.EmployeeDao;
import com.spring.ORM.SpringFrameworkORM.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Initiated!" );
        ApplicationContext con = new  ClassPathXmlApplicationContext("Config.xml");
        EmployeeDao employeeDao = con.getBean("employeeDao", EmployeeDao.class);
        Employee emp = new Employee();
        emp.setEmpName("Lucifer");
        emp.setEmpCity("Lux, L. A");
        int save = employeeDao.save(emp);
        System.out.println("Record inserted: "+ save);
                
    }
}
