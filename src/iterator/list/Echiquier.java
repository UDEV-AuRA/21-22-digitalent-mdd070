package iterator.list;

public class Echiquier implements Iterable {

    private final String[][] tableau;
    public final int tailleX;
    public final int tailleY;

    public Echiquier(int tailleX, int tailleY) {
        this.tailleX = tailleX;
        this.tailleY = tailleY;
        tableau = new String[this.tailleX][tailleY];
    }

    public String get(int x, int y) {
        return tableau[x][y];
    }

    public void set(int x, int y, String valeur) {
        tableau[x][y] = valeur;
    }

    public EchiquierIterator iterator() {
        return new EchiquierIterator(this);
    }
}
