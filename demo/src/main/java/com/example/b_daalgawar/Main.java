package com.example.b_daalgawar;
public class Main {
    public static void main(String[] args) {
        Pet p1 = SimpleFactory.createPet("dog", "Basar");
        Pet p2 = SimpleFactory.createPet("cat", "Ketty");
        Pet p3 = SimpleFactory.createPet("bird", "Charlaa");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}