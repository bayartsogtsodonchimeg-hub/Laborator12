package com.example.b_daalgawar;
public class Main {
    public static void main(String[] args) {
        Pet p1 = SimpleFactory.createPet("dog", "Bono");
        Pet p2 = SimpleFactory.createPet("cat", "Tom");
        Pet p3 = SimpleFactory.createPet("bird", "Rio");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}