package composite.fichier.sanspattern;

import java.util.ArrayList;
import java.util.List;

public class Dossier {

    private String nom;
    private List<Fichier> fichiers = new ArrayList<>();
    private List<Dossier> sousDossiers = new ArrayList<>();

    public int getTailleKo() {
        int tailleTotal = 0;
        for (Fichier fichier : fichiers) {
            tailleTotal += fichier.getTailleKo();
        }
        for (Dossier sousDossier : sousDossiers) {
            tailleTotal += sousDossier.getTailleKo();
        }
        return tailleTotal;
    }

    // public int getTailleKo() {
    //     int tailleTotal = 0;
//
    //     List<Dossier> temps = new ArrayList<>();
    //     temps.add(this);
    //     while (!temps.isEmpty()) {
    //         Dossier dossier = temps.remove(0);
    //         for (Fichier fichier : dossier.fichiers) {
    //             tailleTotal += fichier.getTailleKo();
    //         }
    //         temps.addAll(dossier.sousDossiers);
    //     }
    //     return tailleTotal;
    // }
}
