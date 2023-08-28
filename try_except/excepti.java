package try_except;

public class excepti {

    int area(int l,int b)throws Exception{
        if(l<0||b<0){
            throw new Exception("Cannot be negative");
        }
        int a = l*b;
        return a;
    }
    void meth1(){
        try{
        int a = area(-10,5);
        System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        excepti ex = new excepti();
        ex.meth1();

    }
    
}
