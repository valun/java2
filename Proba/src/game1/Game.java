/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

/**
 *
 * @author valtut
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Check ch = new Check();
        Pole p = new Pole();
        //Pole p1 = new Pole();



        p.initPole();

        //for (int i = 0; i < 10; i++) {
            ch.goPole(p);
           // ch.p1ToP(p);
            //p.showPole();
        //}




        //ch.checkAlive(ch.count);

    }
}
