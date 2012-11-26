/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

public class Pole {

    boolean[][] pole = new boolean[10][10];

    public void initPole() {
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                pole[i][j] = false;
            }
        }
        pole[1][1] = true;
        pole[1][2] = true;
        pole[2][1] = true;
    }
    
   public void showPole(){
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                System.out.print(pole[i][j] + " ");
            }
            System.out.println("");
        }
   }
}
