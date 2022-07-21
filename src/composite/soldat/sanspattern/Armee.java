package composite.soldat.sanspattern;

import java.util.ArrayList;
import java.util.List;

public class Armee implements UniteMilitaire {

    private List<Esquouad> esquouads = new ArrayList<>();

    @Override
    public void seDeplacer() {
        for (Esquouad esquouad : esquouads) {
            esquouad.seDeplacer();
        }
    }
}
