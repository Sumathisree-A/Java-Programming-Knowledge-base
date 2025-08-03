// binding data (variables) and methods within a single unit

class Person{
    private String firstName;
    private String lastName;

    public void setFirstName(String firstName){  // void = no retunr
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("Sumathisree");
        System.out.println(p.getFirstName());
        p.setLastName("A.T");
        System.out.println(p.getLastName());
    }
}