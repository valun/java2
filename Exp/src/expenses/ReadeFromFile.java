/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author valtut
 */
public class ReadeFromFile {

    WriteToFile w = new WriteToFile();
    List<String> list;

    public List<String> readeFile() throws Exception {
        list = new ArrayList();
        try {

            InputStreamReader isr =
                    new InputStreamReader(new FileInputStream(w.fileName));
            BufferedReader buff = new BufferedReader(isr);
            StringBuilder strBuff = new StringBuilder();
            String s;
            while ((s = buff.readLine()) != null) {
                strBuff.append(s);
                list.add(s);
            }
            show(list);
        } catch (IOException iOException) {
            System.out.println("Faila net !");
        }
        return list;
    }

    public void show(List list) {
        System.out.println("   data     summa    des");
        int i = 0;
        for (Object d : list) {
            i = i + 1;
            System.out.println(i + "." + d.toString());
        }
    }
}