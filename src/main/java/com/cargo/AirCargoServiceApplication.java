package com.cargo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@EnableAutoConfiguration
public class AirCargoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirCargoServiceApplication.class, args);
	}

}
