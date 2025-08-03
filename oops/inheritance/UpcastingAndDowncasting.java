

/*
Types of Typecasting

upcasting 
    - typecssting child obj to parent obj and done implicitly
    - can access the methods nd variables of parent class unless overridden , can't use child methods
downcasting 
    - typecasting parent obj to child obj and done explicitly
    - "ClassCastException" thrown if parent doesn't actually point to a child object

*/

class Vehicle{
    void drive(){
        System.out.println("Driving a vehicle...");
    }
}

class Car extends Vehicle{
    void drive(){
        System.out.println("Driving a car...");
    }

    void speedUp(){
        System.out.println("Speeding up the car...");
    }
}

public class UpcastingAndDowncasting{
    public static void main(String[] args) {

        /*

        Vehicle v = new Vehicle();
        Car c = (Car) v;  //Runtime error: ClassCastException

        */

        Vehicle v = new Car(); // upcasting
        System.out.println("upcasting");
        v.drive();
        Car c = (Car) v; // downcasting
        System.out.println("Downcasting");
        c.drive();
        c.speedUp();
    }
}