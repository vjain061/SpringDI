package com.SpringDI;

public class Airtel {
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void service(){
		service.activateService();
	}
}
