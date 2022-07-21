package visitor.poi;

public class TourismeVisitor extends AbstractVisitor {
    @Override
    public void doForParc(Parc parc) {
        if (parc.isEntreeLibre()) {
            System.out.println("Je vous conseille de visiter ce parc " + parc);
        } else {
            //RIEN
        }
    }

    @Override
    public void doForRestaurant(Restaurant restaurant) {
        String type = restaurant.getType();
        System.out.println("Je vous conseille d'aller manger a ce restaurant " + type + " " + restaurant);
    }
}
