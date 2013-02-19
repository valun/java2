package javakrestik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Выбирите тип игры :");
        System.out.println("1-Игра двух пользователей  2 - Игра с компьютером   3 - Игра компьютера");
        int type = scan.nextInt();

        Game game;
        if (type == 1) {
            game = new Game(new HumanPlayer(), new HumanPlayer());
        } else if (type == 2) {
            game = new Game(new AiPlayer(), new HumanPlayer());
        } else if (type == 3) {
            game = new Game(new AiPlayer(), new AiPlayer());
        } else {
            game = new Game(new HumanPlayer(), new HumanPlayer());
        }
        game.play();


    }
}
