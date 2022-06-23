package com.mozahidone.lambda;

public class Calculator {

    public static void main(String[] args) {
        Operation operation = (input) -> System.out.println(input);
        operation.sum(400);
    }
}
