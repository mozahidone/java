package com.mozahidone.functionalInterface;

import java.util.function.Function;

public class PracticeFunction {

    public static void main(String[] args) {
        Function<String, String> aonymousFunction = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        String result = aonymousFunction.apply("zayed");
        System.out.println(result);

        Function<String, String> lambdaImplementaiotn = input -> input.toLowerCase();
        String output = lambdaImplementaiotn.apply("Nusaiba");
        System.out.println(output);
    }
}
