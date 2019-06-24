package playingAroundWithSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Collage collage = context.getBean("getCollage",Collage.class);
		
		collage.welcomeMessage();
		
	}
}
