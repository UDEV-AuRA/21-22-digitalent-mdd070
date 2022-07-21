package uml;

public class Classe1 extends Classe2 /*Héritage*/ implements Classe3 /*Implémentation*/ {

    private Classe4 classe4 = new Classe4(); /* assciaion ou agregation ou composition */


    public void faireCalcule() {
        Classe5 classe5 = new Classe5();
        classe5.faireSousCalcule(); /* Depends */

    }

}
