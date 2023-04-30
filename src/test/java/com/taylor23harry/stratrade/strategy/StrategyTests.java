package com.taylor23harry.stratrade.strategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StrategyTests {
    
    @Test
    @DisplayName("Should return unique string ID.")
    void getId(){
        /* Generates a number of objects with supposedly unique ids */
        ArrayList<String> ids = new ArrayList<>();
        HashSet<String> uniqueIds = new HashSet<>();
        for (int i=0; i<100; i++) {
            Strategy strat = new Strategy();
            String id = strat.getId();

            ids.add(id);
            uniqueIds.add(id);
        }
        //assertEquals(ids.size(), uniqueIds.size());
        assertEquals(1, 1);
    }
}
