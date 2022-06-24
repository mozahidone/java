package com.mozahidone.lambda;

import java.util.Arrays;

public class LambdaExercise {

    public class Dog {
        String name;
        public String getName() {
            return name;
        }

        public Dog(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        LambdaExercise lambdaExercise = new LambdaExercise();
        Dog[] dogs = lambdaExercise.dogList();

        /*Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });*/
        //now we will construct the lambda expression
        // 1. Copy the abstract method implementation from Comparator functional interface
        /*public int compare(Dog o1, Dog o2) {
            return o2.getName().compareTo(o1.getName());
        }*/
        // 2. There will be no access modifier, return type and function name
        /*(Dog o1, Dog o2) {
            return o2.getName().compareTo(o1.getName());
        }*/
        // 3. Remove the parameter type as compiler can detect it and remove the curly brace as there is one expression only
        //(o1, o2) -> o2.getName().compareTo(o1.getName());
        Arrays.sort(dogs, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        Arrays.stream(dogs).forEach(dog -> System.out.println(dog.getName()));
    }

    private Dog[] dogList() {
        Dog[] dogs = { new Dog("Dog2"), new Dog("Dog1"),new Dog("Dog4"), new Dog("Dog3")};
        return dogs;
    }
}
