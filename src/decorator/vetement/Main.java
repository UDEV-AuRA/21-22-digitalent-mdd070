package decorator.vetement;

public class Main {
    public static void main(String[] args) {
        Personne personne1 = new Nudiste();
        Personne personne2 = new PullDecorator(new Nudiste());
        Personne personne3 = new ManteauDecorator(new PullDecorator(new Nudiste()));


        Personne personne4 = new Nudiste();
        personne4.setPrenom("John");
        //
        personne4 = new PullDecorator(personne4);
        //..
        personne4 = new ManteauDecorator(personne4);

        personne4.getPrenom();// => John
    }
}
