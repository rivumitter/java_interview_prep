package threads_demo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    int capacity;
    final Queue<Integer> integerQueue;

    public QueueDemo(int capacity) {
        this.capacity = capacity;
        integerQueue = new LinkedList<>();
    }

    public boolean add(int num) {

        synchronized (integerQueue) {
            while (capacity== integerQueue.size()) {
                try {
                    integerQueue.wait(); // th1 , th2
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            integerQueue.add(num);
            System.out.println("added..");
            integerQueue.notifyAll();
            return true;
        }
    }

    public int remove()  {

        synchronized (integerQueue) {
            while (integerQueue.size() == 0) {
                try {
                    integerQueue.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            int temp = integerQueue.poll();
            System.out.println("removed..");
            integerQueue.notifyAll();
            return temp;
        }
    }
}
