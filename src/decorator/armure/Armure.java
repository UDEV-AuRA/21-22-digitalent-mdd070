package decorator.armure;

public class Armure {
    public double calculerDegat(TypeDegat typeDegat, double degat) {
        if (typeDegat == TypeDegat.CONTONDANT) {
            return degat / 50 / 100;
        } else {
            return degat;
        }
    }

    public double calculerVitesse(double vitesseInitial) {
        return vitesseInitial / 2;
    }
}
