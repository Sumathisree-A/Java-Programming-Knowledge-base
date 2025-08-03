public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening)
        // byte --> short --> int --> long --> float --> double 
        int i = 10;
        double d = i;
        System.out.println("Implicit casting (int to double): " + d);

        // Explicit casting (narrowing)
        // double --> float --> long --> int --> short --> byte
        double d2 = 10.99;
        int i2 = (int) d2;
        System.out.println("Explicit casting (double to int): " + i2);
    }
}
