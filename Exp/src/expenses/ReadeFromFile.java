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
    List<String> list = new ArrayList<String>();

    public List readeFile() throws Exception {

        try {

            InputStreamReader isr =
                    new InputStreamReader(new FileInputStream(w.fileName));
            BufferedReader buff = new BufferedReader(isr);
            StringBuilder strBuff = new StringBuilder();
            String s;
            int i = 0;
            while ((s = buff.readLine()) != null) {
                i = i + 1;
                strBuff.append(s);
                list.add(i + "." + s);
            }
            show(list);
        } catch (IOException iOException) {
            System.out.println("Faila net !");
        }
        return list;
    }

    public void show(List list) {
        System.out.println("   data     summa    des");
        for (Object d : list) {
            System.out.println(d.toString());
        }
    }
}