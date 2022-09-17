package com.mozahidone.methodReference;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {
        Practice1 instance = new Practice1();
        List<String> data = instance.getData();
        //data.forEach(s -> System.out.println(s));
        data.forEach(System.out::println);
    }

    private List<String> getData() {
        List<String> data = new ArrayList<>();
        data.add("Zayed");
        data.add("Nusaiba");
        data.add("Musfira");
        data.add("Zuairia");

        return data;
    }
}
