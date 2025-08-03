class Person{
    String name;
    public Person(){            // super() method added automatically by default
        System.out.println("Person Class Constructor Invoked");
        name = "sree";
        System.out.println("Name : " + name);
    }

    public Person(String name){
        System.out.println("Person Class Paramterized Constructor Invoked");
        this.name = name;
        System.out.println("Name : " + name);
    }
}

class Employee extends Person{
    String designation;
    public Employee(){      // super() method added automatically by default
        System.out.println("Employee Class Constructor Invoked");      
        designation = "SE";
        System.out.println("Designation : " + designation);
    }

     public Employee(String designation){      
        super("Sau");       // need to add manually to call parameterized constructor else it will call default constructor
        System.out.println("Employee Class Paramterized Constructor Invoked");      
        this.designation = designation;
        System.out.println("Designation : " + designation);
    }
}

public class ChainingUsingInheritance{
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee e1 = new Employee("SSE");
    }
}
