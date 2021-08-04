package callback;

public class Sync {
    private MyEventListener listener;

    public void register(MyEventListener listener) {
        this.listener = listener;
    }

    public void method1() {
        System.out.println("Callback before sync task");
        if (this.listener != null) {
            listener.event1();
        }
    }

    public static void main(String[] args) {
        Sync obj = new Sync();
        MyEventListener listener = new A();
        obj.register(listener);
        obj.method1();
    }
}

interface MyEventListener {
    void event1();
}

class A implements MyEventListener {

    @Override
    public void event1() {
        System.out.println("Callback after sync task");
    }
}
