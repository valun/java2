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
        Scanner scan = new Scanner(System.in);
        while (true) {
            
            System.out.println('\n' + " 1 - View  2 - Add  3 - Del  4 - Exit" + '\n');

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
                    System.exit(0);
                    break;

                default:
            }
        }
    }
}
