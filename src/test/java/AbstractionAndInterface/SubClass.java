package AbstractionAndInterface;

public class SubClass extends AbstractClass{

    @Override
    public void Display() {
    InterfaceBaseClass.println("hello");
    }
    public static void main(String []args){
        InterfaceBaseClass.staticDisplay("calling static method in interface");
    }
}
