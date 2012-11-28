/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

public class Pole {

    boolean[][] pole = new boolean[10][10];
    
    
    public void initPole() {
        pole[1][1] = true;
        pole[1][2] = true;
        pole[1][3] = true;
        pole[2][1] = true;
        pole[3][1] = true;
        pole[4][1] = true;
    }

    public void showPole() {
        System.out.println("");
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                System.out.print(pole[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
