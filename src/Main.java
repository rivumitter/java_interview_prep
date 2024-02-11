import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {


        AtomicInteger atomicInteger = new AtomicInteger(0);

        for (int i = 0; i < 5; i++) {
            new Thread(()-> {
                System.out.println(atomicInteger.incrementAndGet());
            }).start();
        }
    }
}