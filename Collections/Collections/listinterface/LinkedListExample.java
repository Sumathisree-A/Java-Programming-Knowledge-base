import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
     names.add("sree");
     names.add("arin");
     names.add("sau");
     names.add("Beaut");

    System.out.println("First name: " + names.getFirst());

    System.out.println(names);
    names.removeLast();
        System.out.println("After removing last name: " + names);
    }
}
