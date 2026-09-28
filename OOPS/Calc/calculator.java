class Calca{

    double a;
    double b;
    public Calca(double a, double b){
        this.a = a;
        this.b = b;
    }
    public double add(){
        return a + b;
    }
    public double sub(){
        return a - b;
    }
    public double mul(){
        return a * b;
    }
    public double div(){
        return a / b;
    }
    public double mod(){
        return a % b;
    }
}

public class calculator {

    public static void main(String[] args) {
        
    Calca O1 = new Calca(13,20);



    System.out.println("Result Addition : "+O1.add());
    System.out.println("Result Subtraction : "+O1.sub());
    System.out.println("Result Multiplication : "+O1.mul());
    System.out.println("Result Division : "+O1.div());
    System.out.println("Result Modulus : "+O1.mod());

}
kk
}
