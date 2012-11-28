/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

import java.lang.reflect.Array;

public class Check {

    Pole1 p1 = new Pole1();

    public void goPole(Pole p) {

        Koordinati k = new Koordinati();
        for (int i = 1; i < p.pole.length; i++) {
            for (int j = 1; j < p.pole.length; j++) {
                k.setX(i);
                k.setY(j);
                counter(k, p);
            }
        }
    }

    public void counter(Koordinati k, Pole p) {

        int x, y, i, j;
        i = k.getX();
        j = k.getY();
        int count = 0;
        if (i - 1 >= 0 && j - 1 >= 0 && i + 2 <= 10 && j + 2 <= 10) {
            for (x = i - 1; x < i + 2; x++) {
                for (y = j - 1; y < 2 + 1; y++) {
                    if (p.pole[x][y] && (!(x == i && y == j))) {
                        count = count + 1;
                    }
                }
            }
        }
        checkAlive(count, k, p);
    }

    public void checkAlive(int count, Koordinati k, Pole p) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                p1.pole1[i][j] = p.pole[i][j];
            }
        }
        if (count == 3) {
            p1.pole1[k.getX()][k.getY()] = true;
        } else if (count == 2 && p.pole[k.getX()][k.getY()]) {
        } else if ((count > 3 || count < 2) && (p.pole[k.getX()][k.getY()] == true)) {
            p1.pole1[k.getX()][k.getY()] = false;
        }
        p1ToP(p);
    }

    public void p1ToP(Pole p) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                p.pole[i][j] = p1.pole1[i][j];
            }
        }
    }
}
