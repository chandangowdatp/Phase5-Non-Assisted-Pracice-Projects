package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class RestControllerWecome {
	
	@GetMapping("/")
	public String welcomeMsg() {
		return "Wellcome All!!!. This is demo to deploy Spring Boot application on Cloud";
	}

}
