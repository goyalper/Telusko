class calc{
    int result;
    public int add(int a, int b){
        result = a+b;
        return result;
    }
    public int sub(int a, int b){
        result = a-b;
        return result;
    }
    public int mul(int a, int b){
        result = a*b;
        return result;
    }
    public int div(int a, int b){
        result = a/b;
        return result;
    }   
    public int mod(int a, int b){
        result = a%b;
        return result;
    }
}


public class oops {
    public static void main(String[] args) {
        calc c = new calc();
        int res = c.add(5, 10);
        System.out.println("5 + 10 = " + res);

        int res2 = c.sub(10, 5);
        System.out.println("10 - 5 = " + res2);

        int res3 = c.mul(5, 10);
        System.out.println("5 * 10 = " + res3);

        int res4 = c.div(10, 5);
        System.out.println("10 / 5 = " + res4);

        int res5 = c.mod(10, 3);
        System.out.println("10 % 3 = " + res5);
    }}