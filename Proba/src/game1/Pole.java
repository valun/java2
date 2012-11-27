/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

public class Pole {

    boolean[][] pole;

    public void initPole() {
        pole = new boolean[10][10];
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                pole[i][j] = false;
            }
        }
        pole[1][1] = true;
        pole[1][2] = true;
        pole[2][1] = true;
    }

    public void showPole() {

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                System.out.print(pole[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void currentPole() {
        Field f = new Field();
        Check ch = new Check();
        initPole();
        for (int i = 1; i < pole.length; i++) {
            for (int j = 1; j < pole.length; j++) {
                f.setX(i);
                f.setY(j);
            }
        }
        showPole();
    }
}
