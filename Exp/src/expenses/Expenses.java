/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses;

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
        System.out.println("1 - Porsmotretj spisok" + "2 - Dobavitj v spisok "
                + " Udalitj iz spiska");

        int x = scan.nextInt();

        switch (x) {
            case 1:
                f.readeFile(e);
                break;
            case 2:
                e.createExp(e);
                break;
            case 3: 
                System.out.println("Vibirite nomer pokupki: ");
                x = scan.nextInt();
                del.deleteFromList(e, x);
                write.writeToFile(e);
                f.readeFile(e);
            case 4:
                break;

            default:
        }





        //e.createExp(e);
        //      

        //  ee.addExp(ee);
        // e.show(e.list);
        // j.wriiteToFile(ee);
        //j.readWithFile(ee.toString());


    }
}
