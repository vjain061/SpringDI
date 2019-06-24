package playingAroundWithSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("playingAroundWithSpring")
public class Config {
	
	@Bean
	public Collage getCollage(){
		return new Collage();
	}

}
