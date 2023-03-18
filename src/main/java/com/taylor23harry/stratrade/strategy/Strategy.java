package com.taylor23harry.stratrade.strategy;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class Strategy {
    private String id;
    
    public Strategy(){
        this.id = UUID.randomUUID().toString();
        
    }

    public String getId(){
        return this.id;
    }
}
