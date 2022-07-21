package observator.telephone;

public interface Observable {

    void subscribe(Observator observator);

    void unsubscribe(Observator observator);
}
