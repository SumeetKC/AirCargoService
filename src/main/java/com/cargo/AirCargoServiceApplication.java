package com.cargo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class AirCargoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirCargoServiceApplication.class, args);
	}

}
