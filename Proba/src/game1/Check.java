/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

public class Check {

    Pole p = new Pole();
    Field f = new Field();

    public void checkAlive(int x, int y) {

        p.initPole();
        int i = f.getX();
        int j = f.getY();
        int d = 0;
        for (i = f.getX() - 1; i < f.getX() + 1; i++) {
            for (j = f.getY() - 1; j < f.getX() + 1; j++) {
                if (p.pole[i][j] && p.pole[f.getX()][f.getY()] == false) {
                    d = d + 1;
                }
            }
        }
        if (d == 3) {
            p.pole[f.getX()][f.getY()] = true;
        }
        System.out.println("");
        p.showPole();
    }
}
