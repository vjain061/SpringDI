package playingAroundWithSpring;

import org.springframework.beans.factory.annotation.Autowired;

public class Collage {
	
	@Autowired
	private Principle principle;
	
	public void welcomeMessage(){
		System.out.println("Welcome to SCSIT");
		principle.printMessageFromPrinciple();
	}
	
	
}
