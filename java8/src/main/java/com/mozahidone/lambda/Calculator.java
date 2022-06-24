package com.mozahidone.lambda;

public class Calculator {

    public static void main(String[] args) {
        /*Operation operation = (input) -> System.out.println(input);
        operation.sum(400);*/

        Operation operation = (op1, op2, op3) -> op1 + op2 + op3;
        System.out.println("Addition: " + operation.formula(12, 40, 22));


        operation = ((op1, op2, op3) -> op1 * op2 * op3);
        System.out.println("Multiplication: " );

        operation = ((op1, op2, op3) -> op1 + op2 + op3);
        System.out.println("Addition: " + operation.formula(1, 2, 3));

    }

}
