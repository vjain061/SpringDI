package com.cellphoneExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("build.xml");
		Airtel airtel = applicationContext.getBean("airtel",Airtel.class);
		
		airtel.service();

	}

}
