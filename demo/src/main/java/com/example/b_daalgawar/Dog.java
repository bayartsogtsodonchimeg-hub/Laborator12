package com.example.b_daalgawar;
class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }
    public String speak() {
        return "How How";
    }
    public String toString() {
        return "Dog - " + name +
               " says " + speak();
    }
}