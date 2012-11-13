/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses;

import com.sun.beans.decoder.ValueObject;
import java.io.*;
import java.util.*;

public class Elem {

    Elem e;
    List<Elem> list = new ArrayList<Elem>();
    String fileName = "c:\\test.txt";
    String data;
    int sum = 0;
    String des = "";
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void createExp(Elem e) throws IOException {

        System.out.print("Введите дату ");
        e.data = reader.readLine();
        System.out.print("Введите сумму ");
        char[] a = new char[10];
        e.sum = reader.read(a);
        System.out.print("Введите описание ");
        e.des = reader.readLine();
        System.out.println(e);


        FileWriter fff = new FileWriter(fileName);
        BufferedWriter buffered = new BufferedWriter(fff);
        buffered.write(e.data);
        buffered.write(e.sum);
        buffered.write(e.des);
        buffered.flush();
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