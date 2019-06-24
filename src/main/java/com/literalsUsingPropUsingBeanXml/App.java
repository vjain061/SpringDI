package com.literalsUsingPropUsingBeanXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("build.xml");
		
		AppStudent appStudent = applicationContext.getBean("appStudent",AppStudent.class);
		
		appStudent.displayStudent();
	}

}
