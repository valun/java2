/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses;

import java.io.*;
import java.util.*;

public class Elem {

    
    String data, sum;
    String des = "";
    WriteToFile ww = new WriteToFile();

    public void createExp() throws IOException {
        Elem e = new Elem();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите дату ");
        e.data = reader.readLine();
        System.out.print("Введите сумму ");
        e.sum = reader.readLine();
        System.out.print("Введите описание ");
        e.des = reader.readLine();
        ww.writeToFile(e);
    }

    @Override
    public String toString() {
        return String.valueOf(data) + " " + String.valueOf(sum) + " " + String.valueOf(des) + " ";
    }
}