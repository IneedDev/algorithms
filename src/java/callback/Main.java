package callback;

public class Main {


    public static void main(String[] args) {
        EventServiceFirst eventServiceFirst = new EventServiceFirst();
        EventListener eventListener = new EventService();
        eventServiceFirst.registerEventServiceFirst(eventListener);
        eventServiceFirst.method();

    }
}
