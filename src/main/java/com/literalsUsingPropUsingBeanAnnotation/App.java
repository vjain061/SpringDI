package com.literalsUsingPropUsingBeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("build.xml");
		
		AppStudentAnnotation appStudent = applicationContext.getBean("appStudentAnnotation",AppStudentAnnotation.class);
		
		appStudent.displayStudent();
	}

}
