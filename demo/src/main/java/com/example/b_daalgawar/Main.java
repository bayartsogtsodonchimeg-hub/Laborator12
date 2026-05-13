package com.example.b_daalgawar;
public class Main {
    public static void main(String[] args) {

        Pet p1 = SimpleFactory.createPet("dog", "Basar");
        Pet p2 = SimpleFactory.createPet("cat", "Ketty");
        Pet p3 = SimpleFactory.createPet("bird", "Charlaa");

        System.out.println(p1.getName() + " : " + p1.speak());
        System.out.println(p2.getName() + " : " + p2.speak());
        System.out.println(p3.getName() + " : " + p3.speak());
    }
}