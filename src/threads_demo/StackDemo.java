package threads_demo;

public class StackDemo {
    int[] arr;
    int top;

    public StackDemo(int n) {
        arr = new int[n];
        top = -1;
    }

    public boolean isFull() {
        return top >= arr.length - 1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public String push(int num) {

        synchronized (this) {
            if (isFull()) return "stack is full";
            top++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            arr[top] = num;
            return "pushed";
        }
    }
    public int pop() {
        synchronized (this) {
            if (isEmpty()) return Integer.MIN_VALUE;
            int temp = arr[top];
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            top--;
            return temp;
        }
    }
}
