package javakrestik;

public class Check {

    boolean viva = false;

    public boolean chekVictory(Pole p) {
        int d = 0;
        char[][] pole = p.pole;

        for (int i = 0; i < pole.length; i++) {
            if (pole[i][i] != '.' && pole[0][0] == pole[2][2] && pole[0][0] == pole[1][1]) {
                d = d + 1;
            }
            if (d == 3) {
                viva = true;
                System.out.println("Игрок " + pole[i][i] + " выиграл !!!");
                return viva;
            }
        }

        if (pole[0][2] == pole[1][1] && pole[2][0] == pole[0][2] && pole[1][1] != '.') {
            viva = true;
            System.out.println("Игрок " + pole[1][1] + " выиграл !!!");
            return viva;
        }

        for (int i = 0; i < pole.length; i++) {
            d = 0;
            for (int j = 0; j < pole.length; j++) {
                if (pole[i][j] != '.' && pole[i][2] == pole[i][j]) {
                    d = d + 1;
                }
                if (d == 3) {
                    viva = true;
                    System.out.println("Игрок " + pole[i][j] + " выиграл !!!");
                    return viva;
                }
            }
        }

        for (int j = 0; j < pole.length; j++) {
            d = 0;
            for (int i = 0; i < pole.length; i++) {
                if (pole[i][j] != '.' && pole[i][j] == pole[2][j]) {
                    d = d + 1;
                }
                if (d == 3) {
                    viva = true;
                    System.out.println("Игрок " + pole[i][j] + " выиграл !!!");
                    return viva;
                }
            }
        }
        for (int i = 0, k = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                if (pole[i][j] != '.') {
                    k = k + 1;
                }
            }
            if (k == 9) {
                System.out.println("Ходов больше нет !!!");
                return true;
            }
        }
        return viva;
    }
}
