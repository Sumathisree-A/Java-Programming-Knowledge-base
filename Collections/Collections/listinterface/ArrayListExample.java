import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(20);
        numbers.add(35);

        System.out.println("First element: " + numbers.get(0));
        System.out.println("All numbers:");
        for (int i = 0; i < numbers.size(); i++) 
        {
            System.out.println(numbers.get(i));
        }
        numbers.remove(Integer.valueOf(11));
        System.out.println("After removing 11: " + numbers);
    }
}
