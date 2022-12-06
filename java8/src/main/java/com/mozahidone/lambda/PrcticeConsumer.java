package com.mozahidone.lambda;

import java.util.function.Consumer;

public class PrcticeConsumer {

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
    }
}
