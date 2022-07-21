package observator.telephone;

import java.util.ArrayList;
import java.util.List;

public class Magasin implements Observable {
    private List<Observator> observators = new ArrayList<>();

    public void reapprovisionner() {
        for (Observator observator : observators) {
            observator.onChange();
        }
    }

    @Override
    public void subscribe(Observator observator) {
        observators.add(observator);
    }

    @Override
    public void unsubscribe(Observator observator) {
        observators.remove(observator);
    }
}
