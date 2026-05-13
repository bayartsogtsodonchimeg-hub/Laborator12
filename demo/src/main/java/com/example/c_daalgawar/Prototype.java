package com.example.c_daalgawar;
public class Prototype {
    public static Student copyStudent(Student s)
            throws CloneNotSupportedException {
        return (Student)s.clone();
    }
}