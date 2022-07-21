package observator.editeur;

import composite.todo_recette.Recette;
import observator.html.Observable;

import java.util.ArrayList;
import java.util.List;

public class Editeur {

    private List<Observator> observators = new ArrayList<>();

    public void save() {
        for (Observator observator : observators) {
            observator.onSave();
        }
    }

    public void subscribe(Observator observator) {
        observators.add(observator);
    }
}
