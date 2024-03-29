package com.docker.DockerJenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class DockerJenkinsApplication {
	 public static final Logger logger = LoggerFactory.getLogger(DockerJenkinsApplication.class);
	
	@GetMapping
	public String message() {
		return "Hey you are inside DockerAssignment";
	}
	public static void main(String[] args) {
		 logger.info(" in First Logger");
		SpringApplication.run(DockerJenkinsApplication.class, args);
	}

}
