package com.autowired;

public class Human {
	private Heart heart;

	public void setHeart(Heart heart) {
		System.out.println("Setting heart using setter");
		this.heart = heart;
	}

	public Human(Heart heart) {
		System.out.println("Setting heart using constructor");
		this.heart = heart;
	}

	public void startPumping() {
		if (heart != null) {
			heart.pumping();
		} else
			System.out.println("Tata");
	}
}
