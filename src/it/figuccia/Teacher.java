package it.figuccia;

public class Teacher {
    // instance variable
    public String teacherName;

    // constructor method
    public Teacher() {
        System.out.println("New Teacher Added!");
    }

    // method that assigns grade to a student
    public void assignGrade(Student alum, int finalGrade) {

        alum.grade = finalGrade;
    }
}