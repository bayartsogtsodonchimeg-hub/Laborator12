package com.example.b_daalgawar;
class Bird extends Pet {
    public Bird(String name) {
        super(name);
    }
    public String speak() {
        return "Jiw Jiw";
    }
    public String toString() {
        return "Bird - " + name +
               " says " + speak();
    }
}