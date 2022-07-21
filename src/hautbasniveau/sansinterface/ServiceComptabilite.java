package hautbasniveau.sansinterface;

public class ServiceComptabilite {
    private MySQLDatasource mySQLDatasource = new MySQLDatasource();

    public void calculerPayes() {
        Object resultat = null;
        //bla bla
        // code métier pour calculer le réultat

        mySQLDatasource.save(resultat);
    }
}
