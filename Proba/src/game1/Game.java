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
        Pole pole = new Pole();
        Check ch = new Check();
        pole.initPole();
        pole.showPole();
        ch.checkAlive(2,2);
    }
}
