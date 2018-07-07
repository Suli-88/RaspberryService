package com.sul.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("classpath*:conf/beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:beans.xml");

		GpioJDBCTemplate studentJDBCTemplate = (GpioJDBCTemplate) context.getBean("gpioTemplate");

//		System.out.println("------Records Creation--------");
//		studentJDBCTemplate.create("Zara", 11);
//		studentJDBCTemplate.create("Nuha", 2);
//		studentJDBCTemplate.create("Ayan", 15);
//
//		System.out.println("------Listing Multiple Records--------");
//		List<Gpio> students = studentJDBCTemplate.listStudents();
//
//		for (Gpio record : students) {
//			System.out.print("ID : " + record.getId());
//			System.out.print(", Name : " + record.getName());
//
//		}
//
//		System.out.println("----Updating Record with ID = 2 -----");
//		studentJDBCTemplate.update(2, 20);
//
//		System.out.println("----Listing Record with ID = 2 -----");
		Gpio student = studentJDBCTemplate.getStudent(2);
		// List<Gpio> student = studentJDBCTemplate.listStudents();
		System.out.print("ID : " + student.getName());
	}
}
