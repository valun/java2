/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javakrestik;

/**
 *
 * @author valtut
 */
public class AiPlayer extends Player {

    @Override
    public void doMove(Pole p) {
        int x = 0, y = 0;
        for (int i = 0; i < p.pole.length; i++) {
            for (int j = 0; j < p.pole.length; j++) {
                if (p.pole[i][j] == '.') {
                    x = i + 1;
                    y = j + 1;
                }
            }
        }
        Koordinati k = new Koordinati(x, y);
        System.out.println("Ходит компьютер " + p.getSymbol());
        p.setValueToField(k);
    }
}
