package hautbasniveau.avecinterface;

public class ServiceComptabilite {

    private Datasource datasource;

    public ServiceComptabilite(Datasource datasource) {
        this.datasource = datasource;
    }

    public void calculerPayes() {
        Object resultat = null;
        //bla bla
        // code métier pour calculer le réultat

        datasource.save(resultat);
    }
}
