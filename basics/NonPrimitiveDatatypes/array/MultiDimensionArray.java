// non primitive or reference data types
public class MultiDimensionArray{
    public static void main (String[] args){
        int[][] numbers;
        numbers = new int[][] {
            {1,2,3,4,5},
            {1,2,3,4,5}
        };

        for(int i = 0 ; i < numbers.length ; i++)
        {
            for (int j = 0 ; j < numbers[i].length ; j++ ){
                System.out.println("Numbers[" + i + "]" + "[ " + j + "] = " + numbers[i][j]);
            }
        }
    }
}