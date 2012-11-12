/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses;


import java.util.*;

public class Elem {

    Elem e;
    List<Elem> list = new ArrayList<Elem>();
    String data;
    int sum = 0;
    String des = "";
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
        for (Object d : list) {
            System.out.println(d.toString());
        }
    }
}