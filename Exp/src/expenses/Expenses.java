/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses;

/**
 *
 * @author valtut
 */
public class Expenses {

    public static void main(String[] arg) throws Exception {

        Elem ee = new Elem();
        ee.addExp(ee);
        //  ee.addExp(ee);
        //ee.show(ee.list);
        JobWithFiles j = new JobWithFiles();
        j.wriiteToFile();


    }
}
