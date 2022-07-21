package visitor.poi;

public interface Visitor {
    void doForMairie(Mairie mairie);

    void doForBanque(Banque banque);

    void doForParc(Parc parc);

    void doForRestaurant(Restaurant restaurant);

}
