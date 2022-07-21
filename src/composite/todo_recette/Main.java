package composite.todo_recette;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Ingredient tomate = new Ingredient(0.3, "piece");
        Ingredient oignon = new Ingredient(0.1, "piece");
        Ingredient huile = new Ingredient(10, "litre");
        Ingredient farine = new Ingredient(2, "kg");
        Ingredient sel = new Ingredient(0.5, "kg");
        Ingredient eau = new Ingredient(0.1, "litre");
        Ingredient mozzarella = new Ingredient(3, "piece");

        Recette sauceTomate = new Recette();
        sauceTomate.add(3, tomate);
        sauceTomate.add(1, oignon);
        sauceTomate.add(0.1, huile);

        Recette pate = new Recette();
        pate.add(0.250, farine);
        pate.add(0.001, sel);
        pate.add(0.250, eau);
        pate.add(0.010, huile);

        Recette pizza = new Recette();
        pizza.addSousRecette(1, sauceTomate);
        pizza.addSousRecette(1, pate);
        pizza.add(2, mozzarella);

        // 1. Calculer le prix d'une recette de manière naïve = sans le pattern Composite
        double prixTotal = calculerPrixRecette(pizza);
        System.out.println("Le prix total de la pizza est " + prixTotal);

        // 2. Calculer le prix d'une recette en utilisant le pattern
        // TODO
    }

    private static double calculerPrixRecette(Recette pizza) {
        // TODO
        return 0;
    }

}
