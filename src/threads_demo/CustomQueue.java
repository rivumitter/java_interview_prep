package threads_demo;

public class CustomQueue {

    public static void main(String[] args) {

        QueueDemo queueDemo = new QueueDemo(5);

        new Thread(()-> {
            int count = 5;
            while (count>0) {
                queueDemo.add(count);
                count--;
            }
        }).start();

        new Thread(()-> {
            int count = 5;
            while (count>0) {
                System.out.println(queueDemo.remove());
                count--;
            }
        }).start();
    }
}
