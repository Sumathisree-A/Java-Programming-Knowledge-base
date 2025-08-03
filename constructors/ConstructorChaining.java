// calling one constructor from another with respect to current obj.
// achieved thru inheritance


class Student {
    // Data Memebers
    int studentId;
    String studentName;
    int studentAge;

    public Student(){        
        this(102,"Thar",21);        // calls parameterized constructor [int , string , int]               
        this.studentId = 101;
        this.studentName = "Sree";
        this.studentAge = 20;
    }

    public Student(int sId, String sName, int sAge){     
        this(103,23,"Sau");         // calls parametrized constrcutor [int , int , string]   
        this.studentId = sId;                               
        this.studentName = sName;
        this.studentAge = sAge;
    }

    public Student(int sId, int sAge, String sName){      
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

public class ConstructorChaining{
    public static void main(String[] args) {
        Student s1 = new Student();  // calls default constructor
        s1.displayDetails();
    }
}