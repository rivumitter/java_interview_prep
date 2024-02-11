package design.pattern;


public class SingletonBookMain {
    public static void main(String[] args) {

        for (int i=0;i<5;i++){
            new Thread(()-> {
                SingletonBook.getSingletonBookInstance();
            }).start();
        }
    }
}
