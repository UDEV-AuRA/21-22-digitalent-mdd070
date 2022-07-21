package composite.soldat.avecpattern;

public class Main {
    public static void main(String[] args) {
        Soldat soldat1 = new Soldat();
        Soldat soldat2 = new Soldat();

        UnitMilitaireComposite esquouad1 = new UnitMilitaireComposite();
        esquouad1.add(soldat1);
        esquouad1.add(soldat2);

        UnitMilitaireComposite esquouad2 = new UnitMilitaireComposite();

        UnitMilitaireComposite armee = new UnitMilitaireComposite();
        armee.add(esquouad1);
        armee.add(esquouad2);
    }
}
