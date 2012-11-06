/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package derevo2;

/**
 *
 * @author valtut
 */
public class RecursShow {

    public Elem showNode(Elem n) {
        if (n.left != null) {
            showNode(n);
        }
        if (n.right != null) {
            showNode(n);
        }
        return n;
    }
}
