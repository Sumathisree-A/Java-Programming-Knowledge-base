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
    }

    public Student(int sId, int sAge, String sName){        // constructor Overloading
        this.studentId = sId;                               
        this.studentAge = sAge;
        this.studentName = sName;
    }

    void displayDetails() {
        System.out.println("Student Id : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + studentAge);
    }
}

public class ConstructorOverloading{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayDetails();

        Student s2 = new Student(102,"Thar",21);
        s2.displayDetails();

        Student s3 = new Student(103,20,"Beaut");
        s3.displayDetails();

        Student s4 = new Student(104,23,"Sau");
        s4.displayDetails();
    }
}