package com.codenicolas.fullstack_backend.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.codenicolas.fullstack_backend")
@EntityScan("com.codenicolas.fullstack_backend.repository.model")
public class FullstackBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(FullstackBackendApplication.class, args);
	}
}
