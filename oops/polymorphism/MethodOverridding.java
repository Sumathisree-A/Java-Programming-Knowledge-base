

/*
    Runtime Polymorphism (Dynamic Polymorphism): Achieved through method overriding
    method overriding - subclass has same method as in parent class
                      - both super class and sub class - has same method name , same return type and same parameter list
*/

class Vehicle
{
    public void print()
    {
        System.out.println("Driving a vehicle...");
    }
}

class Bike extends Vehicle
{
    public void print()
    {
        System.out.println("Riding a bike...");
    }
}

class Car extends  Vehicle
{
    public void print()
    {
        System.out.println("Driving a car...");
    }
}

public class MethodOverridding
{
    public static void main(String[] args) {
        Car c = new Car();
        c.print();

        Bike b = new Bike();
        b.print();

        // Java decides which method to call
    }
}