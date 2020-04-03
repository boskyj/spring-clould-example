package com.bosky.eval;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Starter {
	public static void main(String[] args) {
		SpringApplication.run(Starter.class, args);
	}

}
