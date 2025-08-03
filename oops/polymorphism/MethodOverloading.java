/* 
    Compile-time Polymorphism (Static Polymorphism): Achieved through method overloading
    method overloading  - multiple methods with same name but different parameters
                        - achieved by changing arguments or data type
*/

class Calculation{

    public static int addition(int num1 , int num2)
    {
        return num1 + num2;
    }

    public static int addition(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }

    public static float addition(float num1 , float num2)
    {
        return num1 + num2;
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        System.out.println(Calculation.addition(100,200));
        System.out.println(Calculation.addition(100,200,300));
        System.out.println(Calculation.addition(10.0F,20.0F));
    }
}