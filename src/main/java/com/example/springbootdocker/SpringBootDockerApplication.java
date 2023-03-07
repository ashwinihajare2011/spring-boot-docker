package com.example.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to Spring Boot Azure Deployment";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
		System.out.println("I am inside Spring Boot Docker");
	}

}
