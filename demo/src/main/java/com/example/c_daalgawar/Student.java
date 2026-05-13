package com.example.c_daalgawar;
public class Student implements Cloneable {
    public static final int NUM_OF_TESTS = 3;

    protected String name;
    protected int[] test = new int[NUM_OF_TESTS];
    protected String courseGrade;
    public Student() {
        this.name = "Sod";
    }
    public Student(String name, int[] test) {
        this.name = name;
        this.test = test;
    }
    public String getCourseGrade() {
        return courseGrade;
    }
    public String getName() {
        return name;
    }
    public int getTestScore(int i) {
        return test[i];
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTestScore(int i, int score) {
        this.test[i] = score;
    }
    public void computeCourseGrade() {
        int total = 0;
        for (int s : test) {
            total += s;
        }
        double avg = (double) total / NUM_OF_TESTS;
        if (avg >= 0)
            courseGrade = "PASS";
        else
            courseGrade = "FAIL";
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}