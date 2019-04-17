package com.springboot.restfull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.springboot.restfull.model","com.springboot.restfull.repositories","com.springboot.restfull.service","com.springboot.restfull.util"})
public class SpringRestfullApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestfullApplication.class, args);
	}
}
