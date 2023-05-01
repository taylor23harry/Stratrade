package com.taylor23harry.stratrade.Trade;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class TradeService {
    private ArrayList<Trade> trades;

    public TradeService(){
        this.trades = new ArrayList<>();
    }


    /* Getters and setters */
    public ArrayList<Trade> getTrades(){
        return this.trades;
    }

    public void addTrade(Trade trade) {
        this.trades.add(trade);
    }

    public void removeTrade(Trade trade) {
        this.trades.remove(trade);
    }

    public void clearTrades() {
        this.trades = new ArrayList<>();
    }
}
