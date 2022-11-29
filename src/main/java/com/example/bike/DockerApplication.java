package com.example.bike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication {
	@GetMapping("/pa")
	public String getMessage() {
		return "Welcome to kkd..!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
