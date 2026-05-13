package com.example.c_daalgawar;
public class Programm {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        Student[] students = new Student[4];

        UndergraduateStudent s1 =
                new UndergraduateStudent(
                        "Bat",
                        new int[]{92, 83, 87});

        GraduateStudent s2 =
                new GraduateStudent(
                        "Bold",
                        new int[]{85, 72, 95});

        Student s3 = Prototype.copyStudent(s1);
        Student s4 = Prototype.copyStudent(s2);

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;

        for (int i = 0; i < students.length; i++) {
            students[i].computeCourseGrade();
            System.out.println(
                    "Ner: " + students[i].getName()
                    + " - Unelgee: "
                    + students[i].getCourseGrade());
        }
    }
}