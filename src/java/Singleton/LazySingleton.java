package Singleton;

public class LazySingleton {

    // Singleton created in lazy way
    // we create singleton when its necessary

    private static LazySingleton istance = null;

    //private constructor

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if(istance==null){
            istance = new LazySingleton();
        }
        return istance;
    }

}
