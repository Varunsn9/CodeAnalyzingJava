package Encapsulation;

public class SuperClassEncapsulation {
    private String privateVariable ="This is a private variable";
    private static String privateStaticVariable="This is a private static variable";

    private static void privateStaticMethod()
    {
     System.out.println("This is a private static method");
    }
    public void getPrivateStaticMethod(){
         privateStaticMethod();
    }
    public String getPrivateStaticVariable()
    {
       return privateStaticVariable;
    }
    public void setPrivateStaticVariable(String setPrivateStaticVariable)
    {
        privateStaticVariable=setPrivateStaticVariable;
    }
    private void privateMethod(){
        System.out.println("This is a private method");
    }
    public SuperClassEncapsulation(){
        System.out.println(privateVariable);
    }
    public String getPrivateVariable(){
        return privateVariable;
    }
    public void setPrivateVariable(String privateVariable){
        this.privateVariable = privateVariable;
    }
    public void getPrivateMethod() {
        privateMethod();
    }
}