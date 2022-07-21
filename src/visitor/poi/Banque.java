package visitor.poi;

public class Banque implements Lieu {
    @Override
    public void accept(Visitor visitor) {
        visitor.doForBanque(this);
    }
}
