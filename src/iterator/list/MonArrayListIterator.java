package iterator.list;

public class MonArrayListIterator implements Iterator {

    private MonArrayList monArrayList;
    private int i = 0;

    public MonArrayListIterator(MonArrayList monArrayList) {
        this.monArrayList = monArrayList;
    }

    public String next() {
        String valeur = monArrayList.get(i);
        i = i + 1;
        return valeur;
    }

    public boolean hasNext() {
        return i + 1 < monArrayList.size();
    }

}
