package com.packt.musicdatabase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicdatabaseApplication {
	private static final Logger logger = LoggerFactory.getLogger(MusicdatabaseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MusicdatabaseApplication.class, args);
		logger.info("Hello Spring Boot");
	}
}
