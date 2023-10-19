package StaticAndNonStatic;

import Encapsulation.SubClassEncapsulation;

public class SubClassWithInheritance extends StaticAndNonStaticMembers {

    public static void main(String []args){
  //  SubClassWithInheritance.staticMethod();
        SubClassWithInheritance subClassWithInheritance=new SubClassWithInheritance();
        subClassWithInheritance.nonStaticMethod1();
    }

    public static void staticMethod(){
        System.out.println("Accessing static variable and method in static method");
        StaticAndNonStaticMembers.staticMethod();
        System.out.println(staticVariable);

    }

    public void nonStaticMethod1(){
        //staticMethod();//accessing current static method because parent and child having the same method name
        System.out.println(nonStaticVariable);
        nonStaticMethod();

    }
}
