package com.example.demo.libs;

import java.util.HashMap;
import java.util.Map;

public abstract class Json {
    // Internal static Map to hold key-value pairs
    private static Map<String, Object> json = new HashMap<>();

    // Static method to add key-value pairs
    public static void set(String key, Object value) {
        json.put(key, value);
    }

    // Static method to retrieve a value by key
    public static Object get(String key) {
        return json.get(key);
    }

    // Static method to return the JSON object as a Map
    public static Map<String, Object> response() {
        return new HashMap<>(json); // Return a copy to ensure immutability
    }

    // Static method to clear the JSON object
    public static void clear() {
        json.clear();
    }
}
