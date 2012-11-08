/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author valtut
 */
public class Elem {

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
        addToList(e);

    }
    
    List<Elem> list = new ArrayList<Elem>();
    public void addToList(Elem e){
        list.add(e);
            
    }

    public void showEle(Elem e) {
        System.out.println(e.data);
        System.out.println(e.sum);
        System.out.println(e.des);
    }

    
    void show(List<Elem> list) {
        System.out.println(list);
    }
}
