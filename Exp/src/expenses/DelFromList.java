/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author valtut
 */
public class DelFromList {

    ReadeFromFile read = new ReadeFromFile();
    WriteToFile write = new WriteToFile();

    public void deleteFromList(int x) throws Exception {
        List list = new ArrayList();
        list = read.readeFile();
        list.remove(x - 1);
        System.out.println("");
        write.writeToFile(list);
    }
}