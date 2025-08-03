// non primitive or reference data types

import java.util.Scanner;

public class SingleDimensionArray{
    public static void main (String[] args){
        int[] numbers;
        numbers = new int[] {1,2,3,4,5};

        for(int i = 0 ; i < numbers.length ; i++)
        {
            System.out.println("Numbers index " + i + " : " + numbers[i]);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int[] arr = new int [n];

        for ( int i =0 ; i < n ; i++){
            System.out.println("Val " + (i+1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\n Printing the elements:");
        for (int i = 0; i < n; i++) {
            System.out.println("Array[" + i + "] = " + arr[i]);
        }
    }
}
