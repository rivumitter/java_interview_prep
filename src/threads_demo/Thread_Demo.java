package threads_demo;

public class Thread_Demo {

    public static void main(String[] args) {
        System.out.println("Main staring:"+ Thread.currentThread());

       Thread thread = new Thread(()-> {
           for(int i=0;i<5;i++)
               System.out.println(Thread.currentThread()+" "+i);
       });
       //thread.setDaemon(true);
       thread.start();
     //  thread.start();

        System.out.println("Main ending:"+ Thread.currentThread());
    }
}

class Thread_One implements Runnable {

    @Override
    public void run() {
        for(int i=0;i<5;i++)
            System.out.println(Thread.currentThread()+" "+i);
    }

}
