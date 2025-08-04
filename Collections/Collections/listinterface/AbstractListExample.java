import java.util.*;


// AbstractList is an abstract class
//so it should be assigned an instance of its subclasses such as ArrayList, LinkedList, or Vector. 

public class AbstractListExample
{
    public static void main(String[] args) {
        AbstractList<String> al = new ArrayList<>();
        al.add("Sree");
        al.add("Home");
        al.add("Garden");

        System.out.println(al);
    }
}