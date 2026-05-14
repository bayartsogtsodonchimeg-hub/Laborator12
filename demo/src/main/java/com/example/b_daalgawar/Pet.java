package com.example.b_daalgawar;
class Pet {
    protected String name;
    public Pet(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String speak() {
        return "";
    }
    public String toString() {
        return "Name: " + name;
    }
}