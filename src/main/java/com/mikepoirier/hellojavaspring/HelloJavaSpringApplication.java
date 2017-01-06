package com.mikepoirier.hellojavaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HelloJavaSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(HelloJavaSpringApplication.class, args);
	}
}
