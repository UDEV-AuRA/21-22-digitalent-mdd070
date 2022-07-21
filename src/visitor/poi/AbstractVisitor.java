package visitor.poi;

public abstract class AbstractVisitor implements Visitor{
    @Override
    public void doForMairie(Mairie mairie) {
        // RIEN
    }

    @Override
    public void doForBanque(Banque banque) {
        // RIEN
    }

    @Override
    public void doForParc(Parc parc) {
        // RIEN
    }

    @Override
    public void doForRestaurant(Restaurant restaurant) {
        // RIEN
    }
}
