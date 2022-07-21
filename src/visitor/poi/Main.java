package visitor.poi;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Lieu> lieux = new ArrayList<>();
        //La liste contient plein de lieux

        // SANS DESIGN PATTERN
        for (Lieu lieu : lieux) {
            if (lieu instanceof Parc) {
                Parc parc = (Parc) lieu;
                if (parc.isEntreeLibre()) {
                    System.out.println("Je vous conseille de visiter ce parc " + parc);
                }
            }
            if (lieu instanceof Restaurant) {
                Restaurant restaurant = (Restaurant) lieu;
                System.out.println("Je vous conseille d'aller manger a ce restaurant " + restaurant.getType() + " " + restaurant);
            }
        }

        // AVEC DESIGN PATTERN
        TourismeVisitor tourismeVisitor = new TourismeVisitor();
        for (Lieu lieu : lieux) {
            lieu.accept(tourismeVisitor);
        }
    }
}
