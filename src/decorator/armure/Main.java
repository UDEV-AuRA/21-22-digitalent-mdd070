package decorator.armure;

public class Main {
    public static void main(String[] args) {
        {
            Personnage personnage = new Barbare();
            personnage.encaisserDegat(TypeDegat.CONTONDANT, 10);
            System.out.println(personnage.getPointDeVie());
            System.out.println(personnage.getVitesse());
        }
        {
            Personnage personnage = new ArmureDecorator(new Barbare());
            personnage.encaisserDegat(TypeDegat.CONTONDANT, 10);
            System.out.println(personnage.getPointDeVie());
            System.out.println(personnage.getVitesse());
        }
    }
}
