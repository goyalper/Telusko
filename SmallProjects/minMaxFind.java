package SmallProjects;

public class minMaxFind {
        
    public static void main(String[] args) {
        // TODO: Declare and initialize an integer array with the values 45, 22, 89, 16, 90, and 33
                 
        int num[] = {45,22,89,16,90,33};

        // TODO: Initialize min and max with the first element
        
        int min = num[0];
        int max = min;
        
        // TODO: Use an enhanced for loop to find min and max
        
        for(int n: num){
            if (n<min){ min=n;}

           if(n>max){max = n;}
        }
        
        // TODO: Print the smallest and largest numbers
        
        System.out.println("Smallest: "+min);
        System.out.println("Largest: "+max);
    
}}
