/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package derevo2;

/**
 *
 * @author valtut
 */
public class Modyelement {

    Elem root;
    Elem current;
    Elem before;

    public void addNewElem(int value) {
        if (root == null) {
            root = new Elem();
            root.value = value;
        }
        current = root;
        while (value != current.value) {
            while (value > current.value) {
                if (current.right != null) {
                    current = current.right;
                } else {
                    before = current;
                    current = new Elem();
                    current.value = value;
                    before.right = current;
                }
            }
            while (value < current.value) {
                if (current.left != null) {
                    current = current.left;
                } else {
                    before = current;
                    current = new Elem();
                    current.value = value;
                    before.left = current;
                }
            }
        }
    }

    public void delElem(int value) {
        current = root;
        while (value != current.value) {

            if (value < current.value) {
                before = current;
                current = current.left;
            } else if (value < current.value && current.left == null) {
                System.out.println("Указанного числа в дереве не существует");
            }


            if (value > current.value) {
                before = current;
                current = current.right;
            } else if (current.right == null) {
                System.out.println("Указанного числа в дереве не существует");
            }
        }

        if (value == current.value && before.value < current.value) {
            before.right = current.right;

            before = current;
            current = current.right;
            while (current.left != null) {
                current = current.left;
            }
            current.left = before.left;
        } else if (value == current.value && before.value > current.value) {
            before.left = current.right;
            //current = current.left;
            while (before.left != null) {
                before = before.left;
            }
            before.left = current.left;
        }
    }

    public Elem showDerevo() {
        current = root;
        RecursShow show = new RecursShow();
        return show.showNode(root);

    }
}
