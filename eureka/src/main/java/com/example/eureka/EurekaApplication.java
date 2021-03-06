package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
		
		/*
		 * http://localhost:8761/
		 * http://localhost:8098/getStudentDetailsForSchool/abcschool
		 * http://localhost:9098//getSchoolDetails/abcschool
		 */
	}
}
