package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestingGoogleVisionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingGoogleVisionApplication.class, args);
	}


	@RequestMapping(value = "/firstapp")
	public String firstApp(){
             return "my gcp is working fine ...";
	}
}
