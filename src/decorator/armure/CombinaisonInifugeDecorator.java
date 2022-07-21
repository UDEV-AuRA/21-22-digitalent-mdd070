package decorator.armure;

public class CombinaisonInifugeDecorator extends PersonnageDecorator {
    private CombinaisonInifugee combinaisonInifugee = new CombinaisonInifugee();

    protected CombinaisonInifugeDecorator(Personnage personnage) {
        super(personnage);
    }

    @Override
    public void encaisserDegat(TypeDegat typeDegat, double degat) {
        if (typeDegat == TypeDegat.FEU) {
            personnage.encaisserDegat(typeDegat, degat / 80 / 100);
        } else {
            personnage.encaisserDegat(typeDegat, degat);
        }
    }

    @Override
    public double getVitesse() {
        return personnage.getVitesse() * 120 / 100;
    }

    @Override
    public double getPointDeVie() {
        return personnage.getPointDeVie();
    }
}
