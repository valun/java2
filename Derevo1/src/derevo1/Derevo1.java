package derevo;

import derevo1.Modyelement;

/**
 *
 * @author valtut
 */
public class Derevo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modyelement derevo = new Modyelement();
        derevo.addFirst(5);
        derevo.addNewElem(3);
        derevo.addNewElem(8);
        derevo.addNewElem(6);
        derevo.addNewElem(2);
        derevo.addNewElem(1);
        derevo.showDerevoL();
        // TODO code application logic here
    }
}