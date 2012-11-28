/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game1;

public class Check {

     

    public void init() {
        // p.initPole();
    }

    public void goPole(Pole p) {
        
        
        Koordinati k = new Koordinati();
        for (int i = 1; i < p.pole.length; i++) {
            for (int j = 1; j < p.pole.length; j++) {
                k.setX(i);
                k.setY(j);
                check(k, p);
            }
        }
        //return p;
    }

    public void check(Koordinati k, Pole p) {

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

    public Pole checkAlive(int count, Koordinati k, Pole p) {
      Pole p1 = new Pole();
       p1 = p;
       System.out.println(k.getX() + " " + k.getY() + " " + count + " $2 было " + p.pole[k.getX()][k.getY()] + " стало " + p1.pole[k.getX()][k.getY()]);
        p.showPole();
        if (count == 3) {
            p1.pole[k.getX()][k.getY()] = true;
        } else if (count == 2 && p.pole[k.getX()][k.getY()]) {
        } else if ((count > 3 || count < 2) && (p.pole[k.getX()][k.getY()] == true)) {
            p1.pole[k.getX()][k.getY()] = false;
        }
       System.out.println(k.getX() + " " + k.getY() + " " + count + " $2 было " + p.pole[k.getX()][k.getY()] + " стало " + p1.pole[k.getX()][k.getY()]);
        p1.showPole();
        



        return p1;
    }

   /* public void p1ToP(Pole p) {
        p = p1;
    }*/
}
