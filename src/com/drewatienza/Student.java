package com.drewatienza;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String grade;
    private int gradeLevel;
    private String studentId;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

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
        gradeLevel = in.nextInt();
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

        setStudentId();
    }

    // Generate ID
    private void setStudentId() {
        // Grade level + id
        id++;
        this.studentId =  gradeLevel + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        // Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to quit): \n" );
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if(!course.equals("Q")) {
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }

    // View balance
    public void viewBalance() {
        System.out.println("Your balance is $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.println("Enter a payment amount: ");
        Scanner pay = new Scanner(System.in);
        int payment = pay.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you " + firstName + " for your payment of $" + payment + ".\n" +
                "Your new balance is $" + tuitionBalance + ".");
    }

    // Show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + grade +
                "\nStudent ID: " + studentId +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }

}
