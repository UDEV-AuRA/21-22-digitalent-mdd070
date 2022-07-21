package composite.soldat.avecpattern;

import java.util.ArrayList;
import java.util.List;

public class UnitMilitaireComposite implements UniteMilitaire {

    private List<UniteMilitaire> uniteMilitaires = new ArrayList<>();

    @Override
    public void seDeplacer() {
        for (UniteMilitaire uniteMilitaire : uniteMilitaires) {
            uniteMilitaire.seDeplacer();
        }
    }

    void add(UniteMilitaire uniteMilitaire) {
        uniteMilitaires.add(uniteMilitaire);
    }

    void remove(UniteMilitaire uniteMilitaire) {
        uniteMilitaires.remove(uniteMilitaire);
    }
}
