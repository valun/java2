package javakrestik;

import java.util.Scanner;

public class Game {

    private Player p1;
    private Player p2;
    private Check ch = new Check();
    private Pole p = new Pole();
    private boolean playerOneDidLastTurn;

    public Game(Player player1, Player player2) {
        p1 = player1;
        p2 = player2;
        playerOneDidLastTurn = false;
    }

    public void play() {
        int i = 0, j = 0;
        while (!ch.chekVictory(p)) {
            if (playerOneDidLastTurn) {
                p2.doMove(p);
                playerOneDidLastTurn = false;
            } else {
                p1.doMove(p);
                playerOneDidLastTurn = true;
            }
        }
    }
}