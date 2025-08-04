/*
It is used to implement an unmodifiable list, for which one needs to only extend this AbstractList Class 
and implement only the get() and the size() methods.

AbstractSequentialList is an abstract class, so it should be assigned an instance of its subclass such as LinkedList.

*/

import java.util.*;

public class AbstractSequentialListExample
{
    public static void main(String[] args) {
        AbstractSequentialList<Integer> asl = new LinkedList<>();
        asl.add(1);
        asl.add(2);
        asl.add(3);
        System.out.println(asl);
    }
}