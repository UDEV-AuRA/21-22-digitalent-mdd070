package hautbasniveau.avecinterface;

public class Main {

    public static void main(String[] args) {

        Datasource datasource = new MySQLDatasource();
        ServiceComptabilite serviceComptabilite = new ServiceComptabilite(datasource);

    }
}
