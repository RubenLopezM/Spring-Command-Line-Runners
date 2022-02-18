package com.example.springboot.BS3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootBs3Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootBs3Application.class, args);
	}

	@Bean
	public MyRunner schedulerunner1(){
		return new MyRunner();
	}

	@Bean
	public MySecondRunner schedulerunner2(){
		return new MySecondRunner();
	}

}
