package Loops;

public class ForLoop {
   static String variable="Varun";

    public static void main(String[] args){
        String reverse="";
        for(int i=variable.length()-1;i>=0;i--){
            reverse+=variable.charAt(i);
        }
        System.out.println(reverse);
    }
}
