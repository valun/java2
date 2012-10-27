/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spisok;

/**
 *
 * @author Home
 */
public class java1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Spisok y = new Spisok();
        y.addEl(2);
        y.addEl(5);
        y.addEl(3);
        y.addEl(7);
        y.addEl(8);
        System.out.println(y.showEl(5));
    }
}
