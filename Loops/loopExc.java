public class loopExc {
    public static void main(String[] args) {
        
        // TODO: Print numbers 1 to 5 using for loop
        System.out.print("For Loop:");
        for(int i=0; i<5; i++)
        System.out.print(" "+(i+1));
        System.out.println();

        // TODO: Print numbers 1 to 5 using while loop
        System.out.print("While Loop:");
        int i=0;
        while(i<5){
        System.out.print(" "+(i+1));
        i++;}
        System.out.println();
        
        // TODO: Print numbers 1 to 5 using do-while loop
        System.out.print("Do-While Loop:");
        int j=0;
        do{ 
            System.out.print(" "+(j+1));
            j++;
        }while(j<5);
        System.out.println();
    }
}
