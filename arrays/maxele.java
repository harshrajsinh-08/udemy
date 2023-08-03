package arrays;

import java.util.Scanner;

public class maxele {
    public static void main(String[] args) {
        int max1=0,max2 = 0;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[];
        arr = new int[size];
        // input of elements
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter element %d: ", i + 1);
            arr[i] = sc.nextInt();
        }
            for (int i = 0; i < arr.length;i++) {
                if (arr[i] > max1) {
                    max2=max1;
                    max1 = arr[i];
                }
                else if(arr[i]>max2){
                    max2=arr[i];
                }
            }
            System.out.print("the maximum is :");
            System.out.println(max1);
            System.out.print("the second maximum is :");
            System.out.println(max2);
            
        }
    }