package com.mozahidone.lambda;

import java.util.*;

public class Sorting {

    public static void main(String[] args) {
        Sorting sortingTesting = new Sorting();
        List<String> data = sortingTesting.getData();
        sortingTesting.sortJava7(data);
        System.out.println("Sorting before java 8: " + data);

        Collections.sort(data, Comparator.reverseOrder());
        System.out.println("Sorting after java 8: " + data);

        //Collections.sort(data, String::compareTo);
    }

    private void sortJava7(List<String> data) {
        Collections.sort(data, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
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
