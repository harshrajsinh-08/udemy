package static_and_final;

class Test{
    static int x=20;
    int y = 40;

    void show(){
        System.out.println(x+ " "+y);
    }
    static void display(){
        System.out.println(x);
    }
}
public class demo_static {
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.x = 10;
        t1.y = 20;
        t1.show();
        Test t2 = new Test();
        t2.x = 100;
        t2.y=400;
        t2.show();

        
    }
}
