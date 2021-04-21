package com.projectSpring.projectmarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProjectMarketApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProjectMarketApplication.class, args);
	}


}
