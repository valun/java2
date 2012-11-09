/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exp;

import java.text.SimpleDateFormat;
import java.util.*;

public class Elem {

    Elem e;
    List<Elem> list = new ArrayList<Elem>();
    String data;
    int sum = 0;
    String des = "";
    SimpleDateFormat form = new SimpleDateFormat("mm/dd/yyyy");
    Scanner scan = new Scanner(System.in);

    public void addExp(Elem ee) {
        Elem e = new Elem();
        System.out.print("Введите дату ");
        e.data = scan.next();
        System.out.print("Введите сумму ");
        e.sum = scan.nextInt();
        System.out.print("Введите описание ");
        e.des = scan.next();
        addToListArray(e);
    }

    public void addToListArray(Elem e) {

        list.add(e);
    }

    @Override
    public String toString() {
        return String.valueOf(data) + " " + String.valueOf(sum) + " " + String.valueOf(des) + " ";
    }

    public void show(List list) {
        // SimpleDateFormat form = new SimpleDateFormat("mm/dd/yyyy");
       // for (Object e : list) {
            System.out.println(list.toString());
            // System.out.println("");
        }
    }

