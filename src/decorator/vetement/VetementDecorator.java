package decorator.vetement;

public class VetementDecorator implements Personne {
    private Personne personne;

    public VetementDecorator(Personne personne) {
        this.personne = personne;
    }

    @Override
    public void setPrenom(String prenom) {

    }

    @Override
    public String getPrenom() {
        return null;
    }
}
