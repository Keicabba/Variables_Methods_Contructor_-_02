package it.figuccia;

public class Tester {
    public static void main(String[] args) {
        // creating two students
        Student student1 = new Student("Jack Daniel");
        Student student2 = new Student("Diana Ross");

        // creating a teacher
        Teacher teacher = new Teacher();
        teacher.teacherName = "Mr. Smith";

        // assigning grades to students
        teacher.assignGrade(student1, 85);
        teacher.assignGrade(student2, 90);

        // printing students' details
        System.out.println("Student 1:");
        student1.getStudentDetails();
        System.out.println("Student 2:");
        student2.getStudentDetails();
    }
}