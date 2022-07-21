package iterator.list;

public class MonArrayList implements MaList, Iterable {
    private String[] tableau = new String[10];
    private int size = 0;

    public void add(String val) {
        // Gérer le cas où le tableau devient trop petit
        tableau[size] = val;
        size = size + 1;
    }

    public int size() {
        return size;
    }

    public String get(int i) {
        return tableau[i];
    }

    public MonArrayListIterator iterator() {
        return new MonArrayListIterator(this);
    }
}
