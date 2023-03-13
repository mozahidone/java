package com.mozahidone.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PracticeConsumer {

    public static void main(String[] args) {

        Consumer<String> consumer = s -> {
            System.out.println(s + 1);
            System.out.println(s + 11);
            System.out.println(s + 111);
        };

        Consumer consumer1 = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o.toString() + 2);
                System.out.println(o.toString() + 22);
                System.out.println(o.toString() + 222);
            }
        };

        consumer.accept("Zayed:");
        consumer1.accept("Nusaiba:");

        List<String> list = Arrays.asList("Zayed", "Nusaiba", "Musfira", "Juairiya");

        Consumer c = null;

        list.forEach(s -> System.out.println(s));
    }
}
