package com.mozahidone.chapter2.item4;

public class MathUtils {
    // Private constructor to prevent instantiation
    private MathUtils() {
        throw new AssertionError("Utility class should not be instantiated");
    }

    // Static methods for utility functionality
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    // Other utility methods and constants
}

