package com.literalsUsingPropUsingBeanAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class AppStudentAnnotation {
	@Value("${student.name}")
	private String studentName;
	private String studentHobby;
	private String studentCourse;

	
	public void setStudentName(String studentName) {
		System.out.println("Setting name using setter");
		this.studentName = studentName;
	}

	@Value("${student.hobby}")
	public void setStudentHobby(String studentHobby) {
		System.out.println("Setting hobby using setter");
		this.studentHobby = studentHobby;
	}

	@Value("${student.course}")
	public void setStudentCourse(String studentCourse) {
		System.out.println("Setting course using setter");
		this.studentCourse = studentCourse;
	}

	public void displayStudent() {
		System.out.println("studentName " + studentName);
		System.out.println("studentHobby " + studentHobby);
		System.out.println("studentCourse " + studentCourse);
	}
}
