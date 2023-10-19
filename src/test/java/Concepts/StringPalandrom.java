package Concepts;

public class StringPalandrom {
    public static void main(String []args){
        System.out.println(isPalandrome("wow"));
    }
    public static boolean isPalandrome(String value){
        int len=value.length()-1;
        String rev="";
        while(len>=0){
        rev+=value.charAt(len);
        len--;
        }
        if(rev.equals(value)){
            return true;
        }else{
            return false;
        }
    }
}
