package callback;

public class Async {

    private MyEventListener listener;

    public void register(MyEventListener listener) {
        this.listener = listener;
    }

    public void method1() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Operation is async task");
                if(listener != null) {
                    listener.event1();
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        Async obj = new Async();
        MyEventListener listener = new AsyncA();
        obj.register(listener);
        obj.method1();
    }
}

class AsyncA implements MyEventListener {

    @Override
    public void event1() {
        System.out.println("Callback after Async task");
    }
}
