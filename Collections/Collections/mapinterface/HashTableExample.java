import java.util.Hashtable;

// a hash table that maps keys to values. 
// no null value , thread safe

public class HashTableExample
{
    public static void main(String args[]) 
    {
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("One ", 1);
        ht.put("Two ", 2);
        ht.put("Three ", 3);

        System.out.println("Hashtable Elements: " + ht);
    }
}