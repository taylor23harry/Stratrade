package com.taylor23harry.stratrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.taylor23harry.stratrade.Strategy.StrategyService;

@SpringBootApplication
public class StratradeApplication {
	private StrategyService strategyService;

	public static void main(String[] args) {
		SpringApplication.run(StratradeApplication.class, args);
		
	}
}
