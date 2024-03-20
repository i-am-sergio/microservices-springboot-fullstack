package com.university.students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class StudentsMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsMicroserviceApplication.class, args);
	}

}
