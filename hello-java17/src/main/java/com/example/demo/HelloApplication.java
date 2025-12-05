package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@SpringBootApplication
@RestController
public class HelloApplication {

	@GetMapping("/hello")
	public Map<String, String> hello() {
		return Map.of(
				"message", "Hello from " + System.getProperty("java.version"),
				"javaVersion", System.getProperty("java.version"),
				"springBootVersion", SpringBootVersion.getVersion()
		);
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
