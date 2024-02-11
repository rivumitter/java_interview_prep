package design.pattern;

/*
    Creational , Behavioural , Structural

    Singleton is Creational design pattern.
 */

public class SingletonBookTwo {

    private static SingletonBookTwo singletonBook = null;
    private static volatile boolean isSet = false;

    private SingletonBookTwo() {
        System.out.println("SingletonBookTwo instance created");
    }

    public static SingletonBookTwo getSingletonBookInstance() {

        if (!isSet) {
            isSet = true; // its going to set in main memory
            singletonBook = new SingletonBookTwo(); // thread wrote in local cache
        }
        return singletonBook;
    }

}
