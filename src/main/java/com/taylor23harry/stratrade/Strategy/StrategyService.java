package com.taylor23harry.stratrade.Strategy;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class StrategyService {
    private ArrayList<Strategy> strategies;

    public StrategyService(){
        this.strategies = new ArrayList<>();
    }

    /* Getters and setters */

    public ArrayList<Strategy> getStrategies() {
        return this.strategies;
    }

    public void addStrategy(Strategy strategy) {
        this.strategies.add(strategy);
    }

    public void removeStrategy(Strategy strategy) {
        this.strategies.remove(strategy);
    }

    public void clearStrategies() {
        this.strategies = new ArrayList<>();
    }

}
