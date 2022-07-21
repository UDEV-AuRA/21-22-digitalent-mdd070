package iterator.list;


public class MaLinkedList implements MaList, Iterable {
    private CaseChainee premiereCase = null;

    public void add(String val) {
        CaseChainee nouvelleCase = new CaseChainee(val, null);
        if (premiereCase == null) {
            premiereCase = nouvelleCase;
        } else {
            CaseChainee caseCourante = premiereCase;
            while (caseCourante.getSuivante() != null) {
                caseCourante = caseCourante.getSuivante();
            }
            caseCourante.setSuivante(nouvelleCase);
        }
    }

    public int size() {
        if (premiereCase == null) {
            return 0;
        }
        CaseChainee caseCourante = premiereCase;
        int size = 1;
        while (caseCourante.getSuivante() != null) {
            caseCourante = caseCourante.getSuivante();
            size = size + 1;
        }
        return size;
    }

    public String get(int i) {
        CaseChainee caseCourante = premiereCase;
        int indexCourant = 0;
        while (indexCourant < i) {
            caseCourante = caseCourante.getSuivante();
            indexCourant = indexCourant + 1;
        }
        return caseCourante.getValeur();
    }

    @Override
    public MaLinkedListIterator iterator() {
        return new MaLinkedListIterator(this);
    }
}

class CaseChainee {
    private String valeur;
    private CaseChainee suivante;

    public CaseChainee(String valeur, CaseChainee suivante) {
        this.valeur = valeur;
        this.suivante = suivante;
    }

    public void setSuivante(CaseChainee suivante) {
        this.suivante = suivante;
    }

    public CaseChainee getSuivante() {
        return suivante;
    }

    public String getValeur() {
        return valeur;
    }
}