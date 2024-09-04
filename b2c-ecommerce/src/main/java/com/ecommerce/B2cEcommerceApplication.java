package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableCaching
@EnableAsync
@SpringBootApplication
public class B2cEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(B2cEcommerceApplication.class, args);
	}
}
