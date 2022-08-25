package com.mozahidone.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LearnStream {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>();
        data.add("Zayed");
        data.add("Nusaiba");
        data.add("Musfira");
        data.add("Zuairia");

        data.stream().forEach(s -> System.out.println(s));
    }
}
