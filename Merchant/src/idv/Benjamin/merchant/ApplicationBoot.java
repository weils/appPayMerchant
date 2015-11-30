package idv.Benjamin.merchant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class ApplicationBoot extends SpringBootServletInitializer{	
	
	public static void main(String...args){
		SpringApplication.run(ApplicationBoot.class, args);
	}

}
