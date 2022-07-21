package observator.telephone;

public class Reparateur implements Observator {
    @Override
    public void onChange() {
        System.out.println("Je dois me former à réparer ce nouveau téléphone.");
    }
}
