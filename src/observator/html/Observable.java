package observator.html;

public interface Observable {

    void subscribe(Observator observator);

    void unsubscribe(Observator observator);
}
