package java_8;

@FunctionalInterface
public interface FunIntf {

    void doSomething();

    default void printDefault() {
        System.out.println("printDefault");
    }

    static void printStatic() {
        System.out.println("printStatic");
    }
}
