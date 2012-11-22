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

    public Elem deleteFromList(Elem e, int x) throws Exception {

        read.readeFile(e);
        read.list.remove(x);
        System.out.println(e.data);
    //    write.writeToFile(e);
        return e;
    
    }
    
    
}