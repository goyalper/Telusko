import java.util.*;

public class foreachLoop{
    
    public static void main(String[] args) {
        int arr[][]=new int [5][3];
        java.util.Random r = new java.util.Random();
        
        for(int[] row:arr){
            for(int j = 0; j < row.length; j++) {
                row[j] = r.nextInt(100);
            }
        }

        for(int[] row:arr){
            for(int value:row){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }
}