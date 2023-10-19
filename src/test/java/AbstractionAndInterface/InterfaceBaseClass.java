package AbstractionAndInterface;

public interface InterfaceBaseClass {
    static String staticVar="this is a static variable";
    String var="nonstatic var";
    static void staticDisplay(String valueToPrint){
        System.out.println(valueToPrint);
    }
    static void println(String value){
        System.out.println(value);
    }
    void Display();
}
