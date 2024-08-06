package com.example.ExternalConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExternalConfigApplication {

	public static void main(String[] args) {
		args= new String[]{"--spring.config.location=file:C:\\properties\\application.properties"};

		SpringApplication.run(ExternalConfigApplication.class, args);
	}

}
