package pkg2darray;

public class Main {

    public static void main(String[] args) {
        int[][] numbersArr = { 
                                {1, 2, 3}, 
                                {4, 5, 6}, 
                                {7, 8, 9}
                             };

        System.out.println("The sum of all the elements is: " + getSum(numbersArr));
        System.out.println("The largest number is: " + getLargest(numbersArr));
        
        getRowSum(numbersArr);
        getColumnSum(numbersArr, 0);
    }
    
    public static int getSum(int[][] arr) {
        int sum = 0;
        for (int[] row : arr) {
            for (int column = 0; column < row.length; column++) {
                sum += row[column];
            }
        }
        
        return sum;
    }
    
    public static int getLargest(int[][] arr) {
        int largest = arr[0][0];
        for (int[] row : arr) {
            for (int column = 0; column < row.length; column++) {
                if (row[column] > largest) {
                    largest = row[column];
                }
            }
        }
        
        return largest;
    }
    
    public static void getRowSum(int[][] arr) {
        for (int[] row : arr) {
            int sum = 0;
            
            for (int i : row) {
                sum += i;
            }
            
            System.out.println("The sum of row " + row + " is: " + sum);
        }
    }
    
    public static int getColumnSum(int[][] arr, int column) {
        int sum = 0;
        
        for (int[] row : arr) {
            sum += row[column];
        }
        
        return sum;
    }
}
