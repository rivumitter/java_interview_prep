package java_8;

public class Class_A implements FunIntf, FunIntfTwo {

    @Override
    public void doSomething() {

    }

    @Override
    public void printDefault() {
        FunIntfTwo.super.printDefault();
    }
}
