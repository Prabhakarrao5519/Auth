package com.quick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickApplication.class, args);
		System.out.println("Hello World");
	}

}
