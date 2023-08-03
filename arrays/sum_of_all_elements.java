package arrays;
import java.util.Scanner;
public class sum_of_all_elements {
    // public static void main(String[] args) {
    //     Scanner sc= new Scanner(System.in);
    //     int size = sc.nextInt();
    //     int arr[];
    //     int sum=0;
    //     arr = new int[size];
    //     // input of elements
    //     for(int i =0;i<size;i++){
    //         System.out.printf("Enter element %d: ",i+1);
    //         arr[i] = sc.nextInt();
    //     }
    //     //accessing and sum
    //     for(int i =0;i<size;i++){
    //         sum += arr[i];
    //     }
    //     System.out.println(sum);
    // }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size = sc.nextInt();
        int arr[];
        arr = new int[size];
        // input of elements
        for(int i =0;i<size;i++){
            System.out.printf("Enter element %d: ",i+1);
            arr[i] = sc.nextInt();
        }
        //accessing and searching
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int index =0;
        int value=0;
        for(int i =0;i<size;i++){
                if(arr[i] == key){
                    index = i;
                    value = arr[i];
                    System.out.printf("the key is found at index %d with value %d\n",index,value);
                    System.out.printf("the key is at %d location of array with value %d"
                    ,index+1,value);

                }
        }
        System.out.println();
    }
}
