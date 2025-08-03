public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try 
        {
            int res = a / b;
            System.out.println("Result: " + res);
        } 
        
        catch (ArithmeticException e) 
        {
            System.out.println("Arithmetic Exception : divide by zero...");
        } 
        
        finally 
        {
            System.out.println("Finally block always run...");
        }
    }
}
