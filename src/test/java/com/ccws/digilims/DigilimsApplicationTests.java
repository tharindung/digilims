package com.ccws.digilims;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DigilimsApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(DigilimsApplication.class);

	@Test
	void contextLoads() {

		logger.info("Starting test case execution...");
		assertEquals(true, true);
		logger.info("Test executed");

	}

}
