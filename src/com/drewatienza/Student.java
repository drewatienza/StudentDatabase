package com.drewatienza;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String grade;
    private int studentId;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student grade level: " +
                "\n1 - Freshman" +
                "\n2 - Sophomore" +
                "\n3 - Junior" +
                "\n4 - Senior");
        int gradeLevel = in.nextInt();
        switch (gradeLevel) {
            case 1:
                this.grade = "Freshman";
                break;
            case 2:
                this.grade = "Sophomore";
                break;
            case 3:
                this.grade = "Junior";
                break;
            case 4:
                this.grade = "Senior";
                break;
            default:
                break;
        }

        System.out.println(firstName + " " + lastName + " - Grade: " + grade);
    }

    // Generate ID

    // Enroll in courses

    // View balance

    // Pay tuition

    // Show status

}
