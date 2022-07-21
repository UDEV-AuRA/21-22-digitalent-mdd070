package decorator.armure;

public interface Personnage {
    void encaisserDegat(TypeDegat typeDegat, double degat);
    double getVitesse();

    double getPointDeVie();
}
