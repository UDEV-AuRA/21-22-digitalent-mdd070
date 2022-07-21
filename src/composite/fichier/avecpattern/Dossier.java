package composite.fichier.avecpattern;

import java.util.ArrayList;
import java.util.List;

// = FileComposite
public class Dossier implements IFichier {

    private List<IFichier> elements = new ArrayList<>();

    @Override
    public int getTailleKo() {
        int taille = 0;
        for (IFichier element : elements) {
            taille += element.getTailleKo();
        }
        return taille;
    }

    void add(IFichier element) {
        elements.add(element);
    }

    void remove(IFichier element) {
        elements.remove(element);
    }
}
