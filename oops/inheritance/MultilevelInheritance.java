/*

is-a relationship - 1. by extending an interface || 2. by extending a class

Types of inheritance :

single inheritance
Multi-level inheritance
Hierarchical inheritance
Multiple inheritance [ not supported by java] - similar functionality can be achieved using interface
Hybrid inheritance - combination of inheritance , achieved using interface

*/


// example for single inheritance


import java.util.Scanner;

class Student {
    // Data Memebers
    int studentId;
    String studentName;
    int studentAge;

    Scanner sc = new Scanner(System.in);

    // Member Function
    public void acceptDetails(){
        System.out.println("Enter Student Id : ");
        studentId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student name : ");
        studentName = sc.nextLine();
        
        System.out.println("Enter your age : ");
        studentAge = sc.nextInt();
    }
    public void displayDetails() {
        System.out.println("Student Id : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);
    }
}

class Marks extends Student{
    protected float total_marks , subject_marks;

    //@Override - optional method , overrides a superclass method.
    public void acceptDetails(){
        super.acceptDetails();
        System.out.println("Enter total marks : ");
        total_marks = sc.nextFloat();
        System.out.println("Enter subject marks : ");
        subject_marks = sc.nextFloat();
    }

    //@Override  
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Total Marks : " + total_marks);
        System.out.println("Subject Marks : " + subject_marks);
    }

}

class Sports extends Marks{
    private float score;

    public void acceptDetails(){
        super.acceptDetails();

        System.out.println("Enter score : ");
        score = sc.nextFloat();
    }

    public void displayDetails(){
        super.displayDetails();

        System.out.println("Score : " + score);
    }
}

public class MultilevelInheritance{
    public static void main(String[] args) {
        Sports s = new Sports();
        s.acceptDetails();
        s.displayDetails();
    }
}