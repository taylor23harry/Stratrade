package com.taylor23harry.stratrade.strategy;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(path = "/strategy")
public class StrategyController {

    private ArrayList<String> names;

    /**
     * Greets user
     * @return string greet
     */
    @GetMapping("/greet")
    public String greet() {
        System.out.println("Greet");
        return "Hello!";
    }

    @GetMapping("/getnames")
    public ArrayList<String> getNames() {
        return this.names;
    }

    @PutMapping("/addname")
    public void addName(String name){
        this.names.add(name);
    }
    @PostConstruct
    @GetMapping()
    protected String iamAlive(){
        System.out.println("I am alive");
        return "I am alive!";
    }

}
