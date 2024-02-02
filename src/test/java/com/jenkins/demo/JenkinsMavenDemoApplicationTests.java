package com.jenkins.demo;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootTest
class JenkinsMavenDemoApplicationTests {
	
	@GetMapping("/helloJenkins")
	public String helloJenkins() {
		return "Hello Maven Jenkins";
	}

}
