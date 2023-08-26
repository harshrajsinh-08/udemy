package Inheritance;

class rect {
    int length;
    int breadth;


    public void area() {
        System.out.print(length * breadth);
    }
}

class rectext extends rect {
    public void peri() {
        length = 2;
        breadth = 2;
        System.out.println(2 * (length + breadth));
    }
}

class p2 {
    String s2 = "Child class";

    public void pr() {
        System.out.println(s2);
    }
}

public class prac {
    public static void main(String[] args) {
        rectext r1= new rectext();
        r1.peri();

    }
}
