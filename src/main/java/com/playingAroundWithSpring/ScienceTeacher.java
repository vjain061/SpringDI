package com.playingAroundWithSpring;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	public void teach() {
		System.out.println("Teaching science");
	}

}
