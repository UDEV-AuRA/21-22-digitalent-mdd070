package iterator.list;

public class EchiquierIterator implements Iterator {

    private Echiquier echiquier;
    private int x = 0;
    private int y = 0;

    public EchiquierIterator(Echiquier echiquier) {
        this.echiquier = echiquier;
    }

    public String next() {
        String valeur = echiquier.get(x, y);
        // incrementer x ou y
        if (y == echiquier.tailleY - 1) {
            x = x + 1;
            y = 0;
        } else {
            y = y + 1;
        }
        return valeur;
    }

    public boolean hasNext() {
        // est ce que x est au max et y au max ?
        return (x + 1) < echiquier.tailleX || (y + 1) < echiquier.tailleY;
    }
}
