package com.taylor23harry.stratrade.Strategy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/strategy")
public class StrategyController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }
    @PostConstruct
    protected void iAmAlive() {
        System.out.println("I am alive!");
    }
}
