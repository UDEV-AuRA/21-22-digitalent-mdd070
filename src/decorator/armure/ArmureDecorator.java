package decorator.armure;

public class ArmureDecorator extends PersonnageDecorator {

    private Armure armure = new Armure();

    protected ArmureDecorator(Personnage personnage) {
        super(personnage);
    }

    @Override
    public void encaisserDegat(TypeDegat typeDegat, double degat) {
        personnage.encaisserDegat(typeDegat, armure.calculerDegat(typeDegat, degat));
    }

    @Override
    public double getVitesse() {
        return armure.calculerVitesse(personnage.getVitesse());
    }

    @Override
    public double getPointDeVie() {
        return personnage.getPointDeVie();
    }
}
