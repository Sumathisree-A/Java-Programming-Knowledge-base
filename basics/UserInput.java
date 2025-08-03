import java.util.Scanner;

public class UserInput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.print("Enter your Gender(M/F) : ");
        char gender = sc.next().charAt(0);

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
    }
}
