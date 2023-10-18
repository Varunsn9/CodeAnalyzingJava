package Encapsulation;

public class SubClassEncapsulation {
    public static void main(String [] args){
        SuperClassEncapsulation superClassEncapsulation=new SuperClassEncapsulation();
        superClassEncapsulation.getPrivateStaticVariable();
        //superClassEncapsulation.privateStaticVariable;
        //cannot access private variables

    }
}
