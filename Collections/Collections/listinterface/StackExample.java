import java.util.*;

// Stack is LIFO (Last In First Out)
public class StackExample
{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while(!s.isEmpty())
        {
            System.out.println("element : " + s.pop());
        }
    }
}