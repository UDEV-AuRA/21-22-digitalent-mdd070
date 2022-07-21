package decorator.armure;

public class CombinaisonInifugee {
    public double calculerDegat(TypeDegat typeDegat, double degat) {
        if (typeDegat == TypeDegat.FEU) {
            return degat / 80 / 100;
        } else {
            return degat;
        }
    }

    public double calculerVitesse(double vitesseInitial) {
        return vitesseInitial / 1.1;
    }
}
