package com.diffBetweenPrototypeAndSingletonBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.literalsUsingPropUsingBeanXml.AppStudent;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sprintbeans.xml");
		Employee employee = context.getBean("employee",Employee.class);
		Employee employee1 = context.getBean("employee",Employee.class);
		employee.printEmployeeName();
		
		
		
	}
}
