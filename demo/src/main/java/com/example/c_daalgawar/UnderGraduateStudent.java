package com.example.c_daalgawar;
public class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name, int[] test) {
        super(name, test);
    }
    public void computeCourseGrade() {
        int total = 0;
        for (int s : test) {
            total += s;
        }
        double avg = (double) total / NUM_OF_TESTS;
        if (avg >= 80)
            courseGrade = "Grad Pass";
        else
            courseGrade = "Grad Fail";
    }
}