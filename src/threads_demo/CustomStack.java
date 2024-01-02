package threads_demo;

import java.util.Objects;

public class CustomStack {
    public static void main(String[] args) throws InterruptedException {
        StackDemo stackDemo = new StackDemo(3);

        new Thread(()-> {
            int counter = 0;
            while (counter < 10) {
                System.out.println(stackDemo.push(15));
                counter++;
            }
        }).start();

        new Thread(()->{
            int counter = 0;
            while (counter < 10) {
                System.out.println(stackDemo.pop());
                counter++;
            }
        }).start();

    }
}
