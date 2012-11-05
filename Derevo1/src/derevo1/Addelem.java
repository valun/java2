/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package derevo1;



/**
 *
 * @author valtut
 */
public class Addelem {

    Elem root;
    Elem current;
    Elem before;

    public void addFirst(int value) {
        if (root == null) {
            root = new Elem();
            root.value = value;
        }
    }

    public void findElem(int value) {
        while (value > current.value) {
            if (current.right != null) {
                current = current.right;
                while (value < current.value) {
                    if (current.left != null) {
                        current = current.left;
                    }
                }
            }
        }
    }

    public void addNewElem(int value) {

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

        while (value != current.value) {

            while (value > current.value) {
                if (current.right != null) {
                    before = current;
                    current = current.right;
                } else {
                    before = current;
                    current.value = value;
                }
            }

            while (value < current.value) {
                if (current.left != null) {
                    before = current;
                    current = current.left;
                } else {
                    before = current;
                    current = current.right;
                }
            }
        }
        if (value < root.value) {
            before.left = current.left;
            before = current;
            current = current.left;
            current.right = before.right;
        } else {
        }



    }

    public int showDerevoL() {
        current = root;


        while (current.left != null) {
            before = current;
            current = current.left;
            System.out.println(current.value);
        }



        return current.value;
    }
}
