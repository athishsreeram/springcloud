package com.springcloud.example.employee;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EmployeeApplication.class)
				.run(args);
	}
}

