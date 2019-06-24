package com.literalsUsingPropUsingBeanXml;

public class AppStudent {
	private String studentName;
	private String studentHobby;
	private String studentCourse;

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public void displayStudent() {
		System.out.println("studentName " + studentName);
		System.out.println("studentHobby " + studentHobby);
		System.out.println("studentCourse " + studentCourse);
	}
}
