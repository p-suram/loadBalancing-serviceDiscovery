package com.learning.microservices.currencyconversionsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CurrencyConversionSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionSvcApplication.class, args);
	}

}
