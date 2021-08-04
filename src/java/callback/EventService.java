package callback;

public class EventService implements EventListener{

    @Override
    public void firstEvent() {
        System.out.println("Callback after sync task");
    }
}
