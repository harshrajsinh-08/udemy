package Patterns.pattern2;
import java.util.Scanner;

public class q2{
    public static void main(String[] args) 
    {   int count=0;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                ++count;
                System.out.printf("%d ",count);
            }
            System.out.println("");
        }
    
    }   
}