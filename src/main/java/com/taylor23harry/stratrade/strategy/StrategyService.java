package com.taylor23harry.stratrade.strategy;

import java.util.ArrayList;

import org.springframework.stereotype.Service;


@Service
public class StrategyService {
    private ArrayList<Strategy> strategies;

    /**
     * Contstructor
     */
    public StrategyService(){
    }


    public ArrayList<String> getStrategyIds(){
        ArrayList<String> ids = new ArrayList<>();
        for (Strategy strategy : this.strategies) {
            ids.add(strategy.getId());
        }
        return ids;
    }


}
