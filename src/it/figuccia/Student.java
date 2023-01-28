package it.figuccia;

public class Student {
    String name;
    int grade;

    // constructor method
    public Student(String studentName) {
        System.out.println("New Student added!");
        name = studentName;
    }

    // method that prints student's details
    public void getStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Grade: " + grade);
    }
}

