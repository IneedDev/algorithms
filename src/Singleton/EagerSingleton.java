package Singleton;

public class EagerSingleton {

    //Singleton early initialisation when creating Singleton instance is not performance consuming process

    private static EagerSingleton instance = new EagerSingleton();

    public EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
