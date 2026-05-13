package com.example.b_daalgawar;
class SimpleFactory {
    public static Pet createPet(String type, String name) {
        if(type.equals("dog")) {
            return new Dog(name);
        }
        if(type.equals("cat")) {
            return new Cat(name);
        }
        if(type.equals("bird")) {
            return new Bird(name);
        }
        return null;
    }
}