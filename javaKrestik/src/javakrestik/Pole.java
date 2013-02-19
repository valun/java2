package javakrestik;

public class Pole {

    char[][] pole = new char[3][3];
    char symbol = 'Y';

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    Pole() {
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                pole[i][j] = '.';
            }
        }
    }

    public void showBoard() {
        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                System.out.print(pole[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public char changeSymbol() {
        if (getSymbol() == 'Y') {
            setSymbol('X');
            return symbol;
        } else {
            setSymbol('Y');
            return symbol;
        }
    }

    public char getPole(Koordinati k) {
        return pole[k.getX() - 1][k.getY() - 1];
    }

    public boolean setValueToField(Koordinati k) {

        if (getPole(k) == '.') {
            pole[k.getX() - 1][k.getY() - 1] = symbol;
            showBoard();
            changeSymbol();
            return false;
        } else {
            System.out.println("Поле уже занято !!!");
            showBoard();
            return false;
        }
    }

    public void setPole(char symbol) {

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole.length; j++) {
                if (pole[i][j] == '.') {
                    pole[i][j] = symbol;
                }
            }
        }
    }
}
