package com.mozahidone.lambda;

import java.util.function.Function;

public class Exercise2 {

    public static void main(String[] args) {
        MyFunctionalInterface myFunctionalInterface = new MyFunctionalInterfaceImpl();
        myFunctionalInterface.execute();

        MyFunctionalInterface my = new MyFunctionalInterface() {
            @Override
            public void execute() {
                System.out.println("hi, how are you!");
            }
        };
        my.execute();

        MyFunctionalInterface aa = () -> {
            System.out.println("hey, how are you!");
        };
        aa.execute();

        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                System.out.println("Testing............");
                return null;
            }
        };
        function.apply(new Object());
    }
}
