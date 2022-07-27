# Spring_ORM_Hibernate
Implementation: 

Steps: 

First: 

Create POGO class, with required annotations. 

Second: 

  Create a Dao package and create a java class within it associated with POGO  
       Eg: if pogo class is named Employee then Dao class will be EmployeeDao. 
  Define a HibernateTemplate attribut with setter and getter methods. 
  Implement method to perform CRUD operations. 

Third: 
  Create a driver class with main method. 

Forth: 
  Create a Configuration file. A xml file, and define the beans and enable required annotations.  
  Configure Doa bean, for instance UserDao, which has a property hibernateTemplate. To set property of UserDao, we have to define a Hibernate Template beans, which has   its own property such as sessionFactory. 
  Thus, we have to define a bean LocalSessionFactoryBean, and which has its properties, such as first: dataSource which takes dataSource object, second:     
  HibernateProperties [where we provide dialect, hbm2ddl.auto, etc] and third: annotatedClasses—which is a Entity class you have defined.  
  To provide the dataSource object, we have to define the bean DriverManagerDataSource which has it's own properties such as, driverClass, url, username, password.  
  [set these properties according to your database] 

Note: 
  To enable all the annotation, we have to import the schema  
      xmlns:tx="http://www.springframework.org/schema/tx" 
      http://www.springframework.org/schema/tx 
      http://www.springframework.org/schema/tx/spring-tx.xsd 
  And, use a tag:  
      <!-- Enabling all annotations --> 
      <tx:annotation-driven /> 
  This, will enable all the annotation used in the project.  

 
