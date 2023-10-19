package Concepts;

public class Resurcion {

    public static void main(String[] args){
        int times=100;
        new Resurcion().print(times);
        System.out.println(add(times));
    }

public static int add(int a){
        if(a>=0){
            return a + add(a-1);
        }else{
            return 0;
        }
}

    public void print(int num)
    {
        if(num>=0){
            System.out.println(num);
            num--;
            print(num);
        }
    }
}
