package interfacee;
interface test{
    void meth1();
    void meth2();

}

class My implements test{
    public void meth1(){
        System.out.println("hello");
    }
    public void meth2(){
        System.out.println("Meth2");
    }

}

public class prac {
    public static void main(String[] args) {
        test t = new My();
        t.meth1();
        t.meth2();
    }
    
}
