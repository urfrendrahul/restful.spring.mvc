package com.example.rest.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.employee.*"}) 
public class App 
{
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
