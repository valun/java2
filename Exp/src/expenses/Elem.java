/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses;


import java.io.*;
import java.util.*;

public class Elem {

    Elem e;
    List<Elem> list;// = new ArrayList<Elem>();
    String fileName = "c:\\test.txt";
    String data, sum;
    String des = "";
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void createExp(Elem e) throws IOException {

        System.out.print("Введите дату ");
        e.data = reader.readLine();
        System.out.print("Введите сумму ");
        e.sum = reader.readLine();
        System.out.print("Введите описание ");
        e.des = reader.readLine();
        //System.out.println(e);
        writeToFile(e);
    }

    public void writeToFile(Elem e) throws IOException {
        FileWriter writer = new FileWriter(fileName, true);
        BufferedWriter buffered = new BufferedWriter(writer);
        buffered.append(e.data + " " + e.sum + " " + e.des + '\n');
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