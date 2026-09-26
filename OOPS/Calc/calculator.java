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

    System.out.println("Result : "+O1.add());
}

}
