package com.taylor23harry.stratrade.Strategy;

import java.util.ArrayList;

import com.taylor23harry.stratrade.helpers.helpers;

public class Strategy {
    private String id;
    private String name;
    private String description;
    private ArrayList<String> tickers;
    
    /* Constructor */
    public Strategy(String name, String description, ArrayList<String> tickers) {
        this.id = helpers.generateId();
        this.name = name;
        this.description = description;
        this.tickers = tickers;
    }
    
    /* Getters and setters */
    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Ticker methods
    public ArrayList<String> getTickers() {
        return this.tickers;
    }

    public void clearTickers() {
        this.tickers = new ArrayList<String>();
    }

    public void addTicker(String ticker){
        this.tickers.add(ticker);
    }

    public void removeTicker(String ticker){
        this.tickers.remove(ticker);
    }

    public void setTickers(ArrayList<String> tickers) {
        this.tickers = tickers;
    }

}
