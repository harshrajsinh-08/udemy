package Abstract_class;

abstract class Super{
    public Super(){
        System.out.println("Super");
    }
    void meth1(){
        System.out.println("Super meth1");
    }
    abstract public void meth2();
}

class Sub extends Super{
    public void meth2(){
        System.out.println("Sub meth 2");
    }
}
public class what {
    public static void main(String[] args) {
        // Super s = new Super();
        Sub sb = new Sub();
        sb.meth1();
        sb.meth2(); 

    }
    
}
