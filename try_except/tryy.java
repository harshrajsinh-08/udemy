package try_except;

public class tryy {
    public static void main(String[] args) {
        int a =5;
        int b = 0;
        try{
            int c = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero ");
        }
    }
}
