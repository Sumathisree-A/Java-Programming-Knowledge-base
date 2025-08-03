import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
     names.add("sree");
     names.add("arin");
     names.add("sau");
     names.add("Beaut");

    System.out.println("First city: " + names.getFirst());

    System.out.println("All names:");

    for (String i : names) 
    {
        System.out.println(i);
    }

    names.removeLast();
        System.out.println("After removing last city: " + names);
    }
}
