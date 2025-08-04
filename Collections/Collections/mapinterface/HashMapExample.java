import java.util.HashMap;

// a hashmap that maps keys to values. 
// allows one null key and many null values and not thread safe

public class HashMapExample
{
    public static void main(String args[]) 
    {
        HashMap<String, Integer> ht = new HashMap<>();

        ht.put("One ", 1);
        ht.put("Two ", 2);
        ht.put("Three ", 3);

        System.out.println("HashMap Elements: " + ht);
    }
}