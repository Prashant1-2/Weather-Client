package com.client.weatherclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherclientApplication {

	private static final Logger log = LoggerFactory.getLogger(WeatherclientApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WeatherclientApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
