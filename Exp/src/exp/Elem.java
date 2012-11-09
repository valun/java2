/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exp;

import java.util.*;

/**
 *
 * @author valtut
 */
public class Elem {

    List<Elem> list = new ArrayList<Elem>();
    Elem e;
    int data;
    int sum = 0;
    String des = "";

    public void addExp(Elem e) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите дату ");
        e.data = scan.nextInt();
        System.out.print("Введите сумму ");
        e.sum = scan.nextInt();
        System.out.print("Введите описание ");
        e.des = scan.next();
        addToListArray(e);
    }

    public void addToListArray(Elem e) {
        list.add(e);
    }

    public void showEle(Elem e) {
        System.out.println(e.data);
        System.out.println(e.sum);
        System.out.println(e.des);
    }

    
    public String toString(){
    
        return String.valueOf(data) + String.valueOf(sum) + String.valueOf(des);
    
    }
    
    public void show(List list) {
        for (Object e : list ){
            System.out.println(list.toString());
        }
    }
}
