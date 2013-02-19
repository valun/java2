package javakrestik;

import java.util.Scanner;

public class HumanPlayer extends Player {

    @Override
    public void doMove(Pole p) {
        System.out.print("Игрок " + p.getSymbol() + " вводит координаты X ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.print("Игрок " + p.getSymbol() + " вводит координаты Y ");
        int y = scan.nextInt();
        Koordinati k = new Koordinati(x, y);
        p.setValueToField(k);
    }
}
