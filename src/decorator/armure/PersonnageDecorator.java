package decorator.armure;

public abstract class PersonnageDecorator implements Personnage {

    protected Personnage personnage;

    protected PersonnageDecorator(Personnage personnage) {
        this.personnage = personnage;
    }

}
