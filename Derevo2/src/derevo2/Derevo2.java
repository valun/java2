/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package derevo2;

import derevo2.Modyelement;

/**
 *
 * @author valtut
 */
public class Derevo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modyelement derevo = new Modyelement();
        derevo.addNewElem(10);
        derevo.addNewElem(3);
        derevo.addNewElem(8);
        derevo.addNewElem(6);
        derevo.addNewElem(16);
        derevo.addNewElem(18);
        derevo.addNewElem(17);
        derevo.addNewElem(15);
        derevo.addNewElem(2);
        derevo.addNewElem(4);
        derevo.addNewElem(7);
        derevo.delElem(3);
        derevo.showTree();
        // TODO code application logic here
    }
}
