package Regex;
import java.util.Scanner;
public class regex_question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int i = test.indexOf("@");
        // System.out.println(i);
        String usrname = test.substring(0, i);
        String domain = test.substring(i+1,test.length());
        System.out.printf("The username is: %s\n",usrname);
        System.out.printf("The domain is: %s",domain);

    }
}
