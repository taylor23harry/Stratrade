package com.taylor23harry.stratrade.helpers;

import java.util.UUID;

public class helpers {
    /**
     * Generates a unique id for the object.
     * @return String: unique id.
     */
    public static String generateId() {
        return UUID.randomUUID().toString();
    }
}
