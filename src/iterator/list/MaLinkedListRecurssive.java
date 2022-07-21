package iterator.list;

public class MaLinkedListRecurssive implements MaList {
    private String valeur;
    private MaLinkedListRecurssive sousListe;

    public int size() {
        if (sousListe == null) {
            return 0;
        } else {
            return 1 + sousListe.size();
        }
    }

    public void add(String valeur) {
        if (sousListe == null) {
            this.valeur = valeur;
            sousListe = new MaLinkedListRecurssive();
        } else {
            sousListe.add(valeur);
        }
    }

    public String get(int i) {
        if (i == 0) {
            return valeur;
        } else {
            return sousListe.get(i - 1);
        }
    }

}
