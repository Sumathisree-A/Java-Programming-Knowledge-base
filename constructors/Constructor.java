class Student {
    // Data Memebers
    int studentId;
    String studentName;
    int studentAge;

    public void displayDetails() {
        System.out.println("Student Id : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);
    }
}

public class Constructor{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayDetails();
    }
}

/*
Output 

Student Id : 0
Student Name : null
Student Age : 0

every class is extending  from object class impilictly and getting default values

*/