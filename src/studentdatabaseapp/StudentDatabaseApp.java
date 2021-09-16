package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        //Ask how many users we want to add
        System.out.print("How many you want to enroll: ");
        Scanner in  = new Scanner(System.in);
        int numberOfStudents = in.nextInt();
        Student[] students = new Student[numberOfStudents];

        // Create n number of new students
        for (int i = 0; i < numberOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        for (int i = 0; i < numberOfStudents; i++){
            System.out.println(students[i].toString());
        }
    }
}
