package com.example.b_daalgawar;
class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
    public String speak() {
        return "Meow Meow";
    }
    public String toString() {
        return "Cat: " + name +
               " says: " + speak();
    }
}