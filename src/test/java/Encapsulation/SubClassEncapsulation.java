package Encapsulation;

public class SubClassEncapsulation extends SuperClassEncapsulation{
    public static void main(String [] args){
        SuperClassEncapsulation superClassEncapsulation=new SuperClassEncapsulation();

        superClassEncapsulation.getPrivateStaticVariable();
       System.out.println(superClassEncapsulation.getPrivateStaticVariable());
        SubClassEncapsulation subClassEncapsulation =new SubClassEncapsulation();
        subClassEncapsulation.subMethod(superClassEncapsulation);
        System.out.println(subClassEncapsulation.subMethod(superClassEncapsulation));
        /*
        superClassEncapsulation.privateStaticVariable;
        cannot access private variables
        */
    }
    public String subMethod(SuperClassEncapsulation obj){
        String variable=obj.getPrivateStaticVariable();//accessing nonstatic method using obj
        return variable;
    }
}
