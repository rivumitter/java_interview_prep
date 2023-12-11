package java_8;

import java.util.function.*;

/**
 * fun interface
 * lambda
 * types + custom
 * default method
 * static methods
 * diamond prob with intf
 * map filter peek steam and problems
 * method reference
 */
public class Java8Tutorial {
    public static void main(String[] args) {

        FunIntf funIntf = () -> System.out.println("do Something printed");

        funIntf.doSomething();

        // supplier

        Supplier<Integer> integerSupplier = () -> 10;

        integerSupplier.get();

        //consumer

        Consumer<Integer> integerConsumer =  val -> System.out.println("val is:"+ val);

        integerConsumer.accept(10);

        // predicate

        Predicate<Integer> integerPredicate =  val -> val > 15;

        integerPredicate.test(12);

        // function

        Function<Integer, String> integerStringFunction = val -> "val is:"+val;

        integerStringFunction.apply(12);

        // callable , runnable , comparator


    }
}
