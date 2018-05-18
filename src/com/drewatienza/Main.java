package com.drewatienza;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    // Ask how many new student you want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of students
        for (int i = 0; i < numOfStudents; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println("\n");
        }

        for (int i = 0; i < numOfStudents; i++) {
            System.out.println(students[i].toString() + "\n");
        }
    }
}
