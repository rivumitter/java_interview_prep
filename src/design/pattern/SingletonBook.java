package design.pattern;

/*
    Creational , Behavioural , Structural

    Singleton is Creational design pattern.
 */

public class SingletonBook {

    private static volatile SingletonBook singletonBook = null;

    private SingletonBook() {
        System.out.println("SingletonBook instance created");
    }

    public static SingletonBook getSingletonBookInstance() {

        if (singletonBook == null) { // optimisation
            synchronized (SingletonBook.class) { // t1,t2
                if (singletonBook == null) {
                    singletonBook = new SingletonBook(); // thread wrote in local cache
                }
            }
        }
        return singletonBook;
    }

}
