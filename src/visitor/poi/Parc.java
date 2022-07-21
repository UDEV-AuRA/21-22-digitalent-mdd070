package visitor.poi;

public class Parc implements Lieu {

    private boolean entreeLibre;

    boolean isEntreeLibre() {
        return entreeLibre;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doForParc(this);
    }
}
