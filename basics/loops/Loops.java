public class Loops
{
    public static void main(String[] args) {

        // while loop

        int ctr = 1 ;
        while(ctr <= 5)
        {
            System.out.println("count : " + ctr);
            ctr++;
        }
        
        // do-while loop - runs atleast once
        int j = 1 ;
        do
        {
            System.out.println("looping for : " + j++);
        }
        while (j!=5);

        // for loop
        for (int i = 1; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // for each
        String[] names = {"Beaut","sree", "thar", "sau"};
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}