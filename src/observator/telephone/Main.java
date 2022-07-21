package observator.telephone;

public class Main {

    public static void main(String[] args) {
        Magasin magasin = new Magasin();

        Client client = new Client();
        magasin.subscribe(client);

        Reparateur reparateur = new Reparateur();
        magasin.subscribe(reparateur);

        magasin.reapprovisionner();
    }
}
