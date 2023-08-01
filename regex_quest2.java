import java.util.Scanner;

public class regex_quest2 {
    //Cheking if a string is Binary number 

    static void chckbin(String num){
        String num1=String.valueOf(num);
        System.out.println(num1.matches("[01]+"));
    }

    static void hexa(String num){
        String hexa=String.valueOf(num);
        System.out.println(hexa.matches("[0-9][A-F]+"));
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        chckbin(num);
        hexa(num);

    }
    
    /* 
    public static void main(String[] args) 
    {
        
        String str="a!B@c#1$2%3";
        
        str=str.replaceAll("[^a-zA-Z0-9]", "");
                
        System.out.println(str);
        
        
    } */
   /* 
    Counting words in a String
    public static void main(String[] args) 
    {
        
        String str="      abc     def     gh   ijk    ";
        
        str=str.replaceAll("\\s+", " ").trim();
        
        String words[]=str.split("\\s");
        
        System.out.println(words.length);
        
        
    }*/   
}

