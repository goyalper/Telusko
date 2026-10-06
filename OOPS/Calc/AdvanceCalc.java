class AdvanceFunc extends Calca{
    public AdvanceFunc(double a, double b){
        super(a,b);
    }
    public double power(){
        return Math.pow(a,b);
    }
    public void greet(){
        System.out.println("Hello, User! Welcome to Advance Calculator");
    }
    public void display(){
        System.out.println("The value of a is: " + a+" and the value of b is: " + b);
    }
}

public class AdvanceCalc {
    
    public static void main(String[] args) {
        
    AdvanceFunc O1 = new AdvanceFunc(13,20);
    System.out.println(O1.add());
    O1.greet();
    System.out.println("Hi There");

    O1.display();
}
}