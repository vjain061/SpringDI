package com.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("build.xml");
		Human human = applicationContext.getBean("human",Human.class);
		
		human.startPumping();
		
	}

}
