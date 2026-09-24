package GetterSetter;

class Num{
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}




public class getterSetter {
    public static void main(String[] args) {
        Num individual = new Num();

        individual.setNum1(10);
        individual.setNum2(20);

        System.out.println("Num1: " + individual.getNum1());
        System.out.println("Num2: " + individual.getNum2());
    }
}