
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

public class ClassAndObjects{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.acceptDetails();
        s1.displayDetails();

        Student s2 = new Student();
        s2.acceptDetails();
        s2.displayDetails();
    }
}