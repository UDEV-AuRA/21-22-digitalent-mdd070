package composite.soldat.sanspattern;

import java.util.ArrayList;
import java.util.List;

public class Esquouad implements UniteMilitaire{

    private List<Soldat> soldats = new ArrayList<>();

    @Override
    public void seDeplacer() {
        for (Soldat soldat : soldats) {
            soldat.seDeplacer();
        }
    }
}
