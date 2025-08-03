// Default - within package
// Public - everywhere
// Private - within class
// Protected - within or outside package using inheritance

import java.util.Scanner;

class Student {
    
    int studentId;                // Default
    public String studentName;   // Public
    private int studentAge;      // Private
    protected String course;     // Protected

    // Method to accept details
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Id : ");
        studentId = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter Student Name : ");
        studentName = sc.nextLine();

        System.out.println("Enter Age : ");
        studentAge = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Course : ");
        course = sc.nextLine();
    }

    //method to display details
    public void displayDetails() {
        System.out.println("Student Id (default): " + studentId);
        System.out.println("Student Name (public): " + studentName);
        System.out.println("Student Age (private): " + studentAge);
        System.out.println("Course (protected): " + course);
    }
}


public class AccessModifiers {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.acceptDetails();

        // Accessing members directly
        System.out.println("Student ID (default): " + s1.studentId);         
        System.out.println("Student Name (public): " + s1.studentName); 
        // System.out.println("Student Age (private): " + s1.studentAge);    //private - not allowed
        System.out.println("Course (protected): " + s1.course);       // within same pkg
        s1.displayDetails();
    }
}
