/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

public class Check {

    Pole p = new Pole();
    Field f = new Field();

    private int check() {
        int count = 0;
        if (f.getX() != 0 || f.getX() != 10) {
            for (int i = f.getX() - 1; i <= f.getX() + 1; i++) {
                for (int j = f.getY() - 1; j <= f.getX() + 1; j++) {
                    if (!(i == f.getX() && j == f.getY())) {
                        if (p.pole[i][j]) {
                            count = count + 1;
                            System.out.println(count);
                        }
                    }
                }
            }
        }
        return count;
    }

    public void check4() {

        p.currentPole();
        boolean current = p.pole[f.getX()][f.getY()];
        f.getX();
        f.getY();
        int count = check();
        if (count == 3) {
            p.pole[f.getX()][f.getY()] = true;
            p.showPole();
        } else {
            if (count == 2 && current) {
                p.pole[f.getX()][f.getY()] = true;
            } else {
                p.pole[f.getX()][f.getY()] = false;
            }
        }
        if (count < 2) {
            p.pole[f.getX()][f.getY()] = false;
        } else if (count > 3) {
            p.pole[f.getX()][f.getY()] = false;
        }
    }
}
