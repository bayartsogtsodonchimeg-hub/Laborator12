package com.example.c_daalgawar;
public class GraduateStudent extends Student {
    public GraduateStudent(String name, int[] test) {
        super(name, test);
    }
    public void computeCourseGrade() {
        int total = 0;
        for (int s : test) {
            total += s;
        }
        double avg = (double) total / NUM_OF_TESTS;
        if (avg >= 60)
            courseGrade = "Undergrad Pass";
        else
            courseGrade = "Undergrad Fail";
    }
}