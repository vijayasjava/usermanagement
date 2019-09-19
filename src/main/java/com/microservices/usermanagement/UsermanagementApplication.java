package com.microservices.usermanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.microservices.usermanagement.model.mongo",
"com.microservices.usermanagement.repo.mongo"})
@EnableJpaRepositories(basePackages = {"com.microservices.usermanagement.model.jpa",
		"com.microservices.usermanagement.repo.jpa"})
@ComponentScan(basePackages = "com.microservices.usermanagement")
public class UsermanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsermanagementApplication.class, args);
	}

}
