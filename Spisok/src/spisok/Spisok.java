/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spisok;

/**
 *
 * @author Home
 */
public class Spisok {

    private Elem first;
    private Elem current;
    private Elem cur;

    public void addEl(int value) {
        if (first == null) {
            first = new Elem();
            first.value = value;
        } else {
            current = first;
            while (current.linc != null) {
                current = current.linc;
            }
            cur = new Elem();
            cur.value = value;
            current.linc = cur;
        }
    }

    public int showEl(int nom) {
        current = first;
        for (int i = 1; i < nom; i++) {
            current = current.linc;
        }
        return current.value;
        
    }
}
