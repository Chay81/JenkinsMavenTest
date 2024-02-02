package com.jenkins.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {
	
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello Maven World";
	}
	
	@GetMapping("/helloWipro")
	public String helloWipro() {
		return "Hello Maven Wipro";
	}

}
