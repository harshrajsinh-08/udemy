import java.util.Scanner;

public class t1 {

    public static void show(int...A){
        for(int a : A){
            System.out.println(a);
        }
    }

    public static void showL(String...A){
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
    public static void main(String[] args) {

        System.out.println("helllo");
        show(5,10,15,20);
        showL("hello","world");
    }
}

