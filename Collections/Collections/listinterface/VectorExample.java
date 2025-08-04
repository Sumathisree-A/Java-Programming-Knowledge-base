// Vector class implements the List interface
import java.util.*;

public class VectorExample
{
    public static void main(String[] args)
    {
        Vector<Integer> v = new Vector<>();  // default vector of the initial capacity is 10.
        v.addElement(103);
        v.addElement(100);
        v.addElement(101);
        v.addElement(102);

        System.out.println(v);
    }
}