package observator.html;

import java.util.ArrayList;
import java.util.List;

public class Button implements Observable {

    private List<Observator> observators = new ArrayList<>();

    @Override
    public void subscribe(Observator observator) {
        observators.add(observator);
    }

    @Override
    public void unsubscribe(Observator observator) {
        observators.remove(observator);
    }


    public void click() {
        for (Observator observator : observators) {
            observator.onClick();
        }

    }
}
