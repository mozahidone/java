package com.mozahidone.functionalInterface;

import java.util.function.Supplier;

public class PracticeSupplier {

    public static void main(String[] args) {
        Supplier supplier = () -> 2+3;

        System.out.println(supplier.get());
    }
}
