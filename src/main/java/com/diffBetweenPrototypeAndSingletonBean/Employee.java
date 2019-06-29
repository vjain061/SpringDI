package com.diffBetweenPrototypeAndSingletonBean;

public class Employee {
	
	
	private Address address;
	
	public Employee(){
		System.out.println("Calling employee constructor");
	}
	
	
	public void setAddress(Address address) {
		System.out.println("Setting address using setter injection");
		this.address = address;
	}



	public void printEmployeeName(){
		System.out.println("Hi this is vaibhav jain");
		address.printAddress();
	}
}
