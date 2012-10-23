/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author valtut
 */
public class java2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner scan = new Scanner(System.in);
        /*
         * System.out.print("Р’РІРµРґРёС‚Рµ Р·РЅР°С‡РµРЅРёРµ РґР»СЏ РµР»РµРјРµРЅС‚Р°: "); x =
         * scan.nextInt();
         */
        Spisok y = new Spisok();
        y.addsp(2);
        y.addsp(3);
        y.addsp(4);
        y.addsp(8);
        y.addsp(15);
        System.out.println(y.show(5));
    }
}