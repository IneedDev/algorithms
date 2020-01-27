package Singleton;

public class SingletonSimpleEager {

    private static final SingletonSimpleEager instance = new SingletonSimpleEager();

    //prvate constructor
    private SingletonSimpleEager() {
    }

    public static SingletonSimpleEager getInstance() {
        return instance;
    }
}

class Sinn{

    public static void main(String[] args) {
        // wywołanie
        SingletonSimpleEager singleton = SingletonSimpleEager.getInstance();

    }
}
