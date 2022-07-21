package decorator.armure;

public class Barbare implements Personnage {
    private double pointDeVie = 100;

    @Override
    public void encaisserDegat(TypeDegat typeDegat, double degat) {
        pointDeVie = pointDeVie - degat;
    }

    @Override
    public double getVitesse() {
        return 10.0;
    }

    public double getPointDeVie() {
        return pointDeVie;
    }
}
