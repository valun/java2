/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package derevo1;

/**
 *
 * @author valtut
 */
public class NodesTree {

    Elem root;

    public void addElement(int value) {
        if (root == null) {
            root = new Elem(value);
        } else {
            root.addChildren(value);
        }
    }

    public void delElement(int value) {
        if (root != null) {
            root.delChildren(value);
        }
    }

    private void showNodeValue(Elem Node) {
       if(Node != null){
        System.out.println(Node.value);
        showNodeValue(Node.left);
        showNodeValue(Node.right);
       }  
    }
    public void showTree() {
        showNodeValue(root);
    }

    
}
