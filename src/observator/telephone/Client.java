package observator.telephone;

public class Client implements Observator {

    @Override
    public void onChange() {
        System.out.println("Je peux acheter au magasin");
    }
}
