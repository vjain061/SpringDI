package com.playingAroundWithSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Collage {
	
	@Autowired
	private Principle principle;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	
	public void welcomeMessage(){
		System.out.println("Welcome to SCSIT");
		principle.printMessageFromPrinciple();
		teacher.teach();
	}
	
	
}
