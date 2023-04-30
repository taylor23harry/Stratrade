package com.taylor23harry.stratrade.Trade;

import java.time.LocalDateTime;

import com.taylor23harry.stratrade.helpers.helpers;

public class Trade {
    private String id;
    private LocalDateTime entry;
    private LocalDateTime exit;
    private float profit;
    private String currency;
    private float position_size;
    private String ticker;
    
    /* Constructor */
    public Trade(
        LocalDateTime entry,
        LocalDateTime exit,
        String currency,
        float position_size,
        String ticker
        ) {
            this.id = helpers.generateId();
            this.entry = entry;
            this.exit = exit;
            this.currency = currency;
            this.position_size = position_size;
            this.ticker = ticker;
            
    }

    /* Getters and Setters */
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getEntry() {
        return this.entry;
    }

    public void setEntry(LocalDateTime entry) {
        this.entry = entry;
    }

    public LocalDateTime getExit() {
        return this.exit;
    }

    public void setExit(LocalDateTime exit) {
        this.exit = exit;
    }

    public float getProfit() {
        return this.profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public float getPosition_size() {
        return this.position_size;
    }

    public void setPosition_size(float position_size) {
        this.position_size = position_size;
    }

    public String getTicker() {
        return this.ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

}
