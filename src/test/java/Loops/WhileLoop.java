package Loops;

public class WhileLoop {
    static String variable="Varun";

    public static void main(String[] args){
        boolean value=false;
        int num=variable.length()-1;
        while(value!=true){
            System.out.print(variable.charAt(num));
            num--;
            if(num==-1){
                value=true;
            }
        }
    }
}
