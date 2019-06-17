package com.revianlabs.lutin;

import com.revianlabs.lutin.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class LutinApplication {

	public static void main(String[] args) {
		SpringApplication.run(LutinApplication.class, args);
	}


}
