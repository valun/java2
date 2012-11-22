/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author valtut
 */
public class Expenses {

    public static void main(String[] arg) throws Exception {

        Elem e = new Elem();
        ReadeFromFile f = new ReadeFromFile();
        DelFromList del = new DelFromList();
        WriteToFile write = new WriteToFile();
        CurrentAray curr = new CurrentAray();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Porsmotretj spisok" + "2 - Dobavitj v spisok "
                    + " Udalitj iz spiska");

            int x = scan.nextInt();

            switch (x) {
                case 1:
                    f.readeFile();
                    break;
                case 2:
                    e.createExp(e);
                    break;
                case 3:
                    System.out.println("Vibirite nomer pokupki: ");
                    x = scan.nextInt();
                    del.deleteFromList(x);
                    break;

                case 4:
                    System.out.println("Vihodim");
                    //write.writeToFile(list);
                    System.exit(0);
                    break;

                default:
            }
        }
    }
}
