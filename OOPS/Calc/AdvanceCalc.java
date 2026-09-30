class AdvanceFunc extends Calca{
    public AdvanceFunc(double a, double b){
        super(a,b);
    }
    public double power(){
        return Math.pow(a,b);
    }
}

public class AdvanceCalc {
    
    public static void main(String[] args) {
        
    AdvanceFunc O1 = new AdvanceFunc(13,20);
    System.out.println(O1.add());
}
}