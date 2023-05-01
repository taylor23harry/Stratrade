package com.taylor23harry.stratrade.Strategy;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/strategy")
public class StrategyController {
    private StrategyService strategyService;


    public StrategyController() {
        this.strategyService = new StrategyService();

        ArrayList<String> demoTickers = new ArrayList<>();
        demoTickers.add("AAPL.US");
        strategyService.addStrategy(new Strategy("Strat1", "demo strategy", demoTickers));
    }

    @RequestMapping(value = "/getstrategies", method = RequestMethod.GET)
    public @ResponseBody ArrayList<Strategy> getStrategies() {
        return strategyService.getStrategies();
    }

    @RequestMapping(value = "/addstrategy", method = RequestMethod.POST)
    public void addStrategy(@RequestParam("strategy") Strategy strategy){
        strategyService.addStrategy(strategy);
    }

    @RequestMapping(value = "/clearstrategies", method = RequestMethod.POST)
    public void clearStrategies() {
        strategyService.clearStrategies();
    }

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello!";
    }
    @PostConstruct
    protected void iAmAlive() {
        System.out.println("I am alive!");
    }
}
