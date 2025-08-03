// non primitive or reference data types

public class StringManipulation{
    public static void main(String[] args) {
        String str1 = "Sree";
        // String str1 = new String("Sree");
        System.out.println(str1);

        String str2 = "Thar";
        // String str1 = new String("Thar");
        System.out.println(str2);

        String str3 = str1 + str2  ; // concatenation
        System.out.println(str3);

        // String Methods
        System.out.println(str3.length());
        System.out.println(str3.charAt(0));
        System.out.println(str1.concat(str2));
        System.out.println(str3.substring(4,8));
        System.out.println(str1.equals(str2));
        System.out.println(str3.contains("Sree"));
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str3.trim());

        // String is immutable
        String str = "Hello";
        // str.concat(" World");   won't change str 
        System.out.println("String: " + str); // Output: Hello

        // StringBuffer is mutable , thread safe
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");  // modifies sb itself
        System.out.println("StringBuffer: " + sb); // Output: Hello World

        // StringBuilder is mutable , not thread safe
        StringBuilder sbuilder = new StringBuilder("Hello ");
        sbuilder.append(" World");  // modifies sb itself
        System.out.println("StringBuilder: " + sbuilder); 

    }
}