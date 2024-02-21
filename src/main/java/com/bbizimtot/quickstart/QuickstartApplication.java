package com.bbizimtot.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class QuickstartApplication {

	public static void main(String[] args) {
		log.info("Spring Test1");
		SpringApplication.run(QuickstartApplication.class, args);
	}

}
