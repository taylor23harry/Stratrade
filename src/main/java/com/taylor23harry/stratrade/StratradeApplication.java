package com.taylor23harry.stratrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootConfiguration
@SpringBootApplication()
public class StratradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(StratradeApplication.class, args);
	}

}