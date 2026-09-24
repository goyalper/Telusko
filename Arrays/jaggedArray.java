import java.util.Random;

public class jaggedArray {
    
    public static void main(String[] args) {
        int[][] arr = new int[5][]; // Jagged array declaration
        arr[0] = new int[5];
        arr[1] = new int[5];
        arr[2] = new int[5];
        arr[3] = new int[8];
        arr[4] = new int[6];

        Random r = new Random();
        
        for(int[] row:arr){
            for(int j = 0; j < row.length; j++) {
                row[j] = r.nextInt(100);
            }
        }

        for(int[] row:arr){
            for(int value:row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}