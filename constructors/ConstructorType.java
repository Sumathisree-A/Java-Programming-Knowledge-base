class Student {
    // Data Memebers
    int studentId;
    String studentName;
    int studentAge;

    public Student(){                       // default constructor
        this.studentId = 101;
        this.studentName = "Sree";
        this.studentAge = 20;
    }

    public Student(int sId, String sName, int sAge){        // parameterized constructor
        this.studentId = sId;                               
        this.studentName = sName;
        this.studentAge = sAge;

        /* when "this" keyword is needed 
        a reference variable that refers to the current object within an instance method or a constructor

            this.studentId = studentId
            this.studentName = studentName
            this.studentAge = studentAge
        */
    }

    void displayDetails() {
        System.out.println("Student Id : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);
    }
}

public class ConstructorType{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayDetails();

        Student s2 = new Student(102,"Thar",21);
        s2.displayDetails();

        Student s3 = new Student(103,"Sau",23);
        s3.displayDetails();
    }
}