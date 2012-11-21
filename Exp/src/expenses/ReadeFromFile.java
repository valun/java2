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
    List<String> list = new ArrayList<String>();
    WriteToFile w = new WriteToFile();

    public void readeFile(Elem e) throws Exception {

        try {
            InputStreamReader isr =
                    new InputStreamReader(new FileInputStream(w.fileName));
            BufferedReader buff = new BufferedReader(isr);
            StringBuffer strBuff = new StringBuffer();
            String s;
            while ((s = buff.readLine()) != null) {
                strBuff.append(s);
                list.add(s);
            }
            show(list);
        } catch (IOException iOException) {
        }
    }

    public void show(List list) {
        System.out.println("data     summa    des");
        for (Object d : list) {
            System.out.println(d.toString());
        }
    }
}
