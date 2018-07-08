package com.how2java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			System.out.println(i);
		}

		SpringApplication.run(SpringbootApplication.class, args);
	}
}
