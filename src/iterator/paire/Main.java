package iterator.paire;

public class Main {
    public static void main(String[] args) {
        Paire paire = new Paire("A", "B");
        parcourirPaire(paire);

        Triplette triplette = new Triplette("X", "Y", "Z");
        parcourirTriplette(triplette);

        parcourirIterable(paire);
        parcourirIterable(triplette);
    }

    private static void parcourirPaire(Paire paire) {
        // 1 parcours la paire => afficher dans la console la valeur de A puis B
    }

    private static void parcourirTriplette(Triplette triplette) {
        // 2 parcours la Triplette => afficher dans la console la valeur de X Y et Z
    }

    private static void parcourirIterable(Object paireOuTriplette) {
        // 3 parcours une paire ou une triplette => afficher dans la console les valeurs
    }

}
