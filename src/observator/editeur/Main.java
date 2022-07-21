package observator.editeur;

public class Main {

    public static void main(String[] args) {
        Editeur editeur = new Editeur();

        SmsObservator smsObservator = new SmsObservator();
        editeur.subscribe(smsObservator);
    }
}
