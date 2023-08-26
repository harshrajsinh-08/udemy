class Super{
    public void meth1(){
        System.out.println("Super meth1");
    }
    public void meth2(){
        System.out.println("Super meth2");
    }
}
class Sub extends Super{
    @Override
    public void meth2(){
        System.out.println("sub meth2");
    }
    public void meth3(){
        System.out.println("sub meth3");
    }
}

public class dynamicdispatch {
    public static void main(String[] args) {
        Super sup = new Super();
        sup.meth1();
        sup.meth2();
        System.out.println();
        
        Sub sb = new Sub();
        sb.meth1();
        sb.meth2();
        sb.meth3();
        System.out.println();
        
        Super sp = new Sub();
        sp.meth1();
        sp.meth2();
        System.out.println();
    }
    
}
