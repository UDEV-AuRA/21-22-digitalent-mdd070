package decorator.vetement;

public class Nudiste implements Personne {
    private String prenom;

    @Override
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }
}
