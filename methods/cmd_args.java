package methods;

public class cmd_args {
    public static void main(String[] args) {
        double sum =0;
        for(String s:args){
            // sum+=s;
            if(s.matches("[0-9\\.]+")){
            sum = sum+Double.parseDouble(s);
            }
        }
    }     
}
