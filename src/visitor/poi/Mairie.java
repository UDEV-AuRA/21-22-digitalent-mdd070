package visitor.poi;

public class Mairie implements Lieu {
    @Override
    public void accept(Visitor visitor) {
        visitor.doForMairie(this);
    }
}
