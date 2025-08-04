// Set ia an interface
// It is an unordered collection and duplicate values cannot be stored. 
import java.util.*;

public class HashSetExample
{
    public static void main(String[] args)
    {
        HashSet<String> s = new HashSet<>();
        s.add("sree");
        s.add("Thar");
        s.add("Beaut");
        s.add("Sau");

        System.out.println(s);
    }
}