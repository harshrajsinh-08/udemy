package Loops;
import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b =1;
        int c=0;
        System.out.print(a+",");
        System.out.print(b+",");
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            if(i == n-1){
                System.out.print(c);
            }
            else{
                System.out.print(c+",");
            }
        }
        System.out.println();
    }
}