package Loops;

public class DoWhileLoop {
    static String variable="Varun";

    public static void main(String []args){
        char reverse=' ';
        int length=variable.length()-1;
        do{
            reverse=variable.charAt(length);
            System.out.print(reverse);
            length--;
        }while (length>=0);
    }
}
