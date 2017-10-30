package test;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import dao.system.DepartmentMapper;

import entity.system.Department;

import service.system.IDepartmentService;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//		SqlSessionFactory factory=(SqlSessionFactory)context.getBean("sqlSessionFactory");
//		SqlSession session=factory.openSession();	  
//		DepartmentMapper departmentMapper=session.getMapper(system.DepartmentMapper.class);
//		
//		System.out.print(departmentMapper.selectByPrimaryKey(1).getName());
		
		DataSourceTransactionManager factory=(DataSourceTransactionManager)context.getBean("transactionManager");
		
		
		
		System.out.println(factory);
		
		
		IDepartmentService u=(IDepartmentService)context.getBean("departmentService");
		
		Department d=new Department();
		d.setDescription("test");
		d.setFax("888888");
		d.setName("test");
		d.setPhone("13996658458");
		
		System.out.print(u.doSaveDepartment(d));


	}

}
