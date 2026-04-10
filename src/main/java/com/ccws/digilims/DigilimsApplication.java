package com.ccws.digilims;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DigilimsApplication {

	private static final Logger logger = LoggerFactory.getLogger(DigilimsApplication.class);

	@PostConstruct
	public void init()
	{
		logger.info("Started Application");
		logger.info("Added Jar name");
	}

	public static void main(String[] args) {
		SpringApplication.run(DigilimsApplication.class, args);
	}

}
