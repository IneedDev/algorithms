package callback;

public class EventServiceFirst {

    private EventListener eventListener;

    public void registerEventServiceFirst(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public void method() {
        System.out.println("Callback before sync task");
        if (this.eventListener != null) {
            eventListener.firstEvent();
        }
    }
}
