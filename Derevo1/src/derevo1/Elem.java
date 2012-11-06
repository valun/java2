/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package derevo1;

/**
 *
 * @author valtut
 */
public class Elem {

    int value;
    Elem left;
    Elem right;

    public Elem(int value) {
        this.value = value;
    }

    public void addChildren(int value) {

        if (this.value > value) {
            if (this.left != null) {
                this.left.addChildren(value);
            } else {
                this.left = new Elem(value);
            }
        } else {
            if (this.right != null) {
                this.right.addChildren(value);
            } else {
                this.right = new Elem(value);
            }
        }
    }

    public void delChildren(int value) {
        Elem res = this.findNodeWithChildrenValue(value);
        Elem delElm = null;
        Elem lastLeftElm = null;

        if (res != null) {
            if (res.value > value) {
                delElm = res.left;
                if (delElm.right != null) {
                    res.left = delElm.right;
                    lastLeftElm = delElm.right;
                    while (lastLeftElm.left != null) {
                        lastLeftElm = lastLeftElm.left;
                    }
                    lastLeftElm.left = delElm.left;
                } else {
                    res.left = delElm.left;
                }
            } else {
                delElm = res.right;
                if (delElm.right != null) {
                    res.right = delElm.right;
                    lastLeftElm = delElm.right;
                    while (lastLeftElm.left != null) {
                        lastLeftElm = lastLeftElm.left;
                    }
                    lastLeftElm.left = delElm.left;
                } else {
                    res.right = delElm.left;
                }
            }
        } else {
            System.out.println("Указанного числа в дереве не существует");
        }
    }

    private Elem findNodeWithChildrenValue(int value) {
        Elem res = null;

        if (this.value > value) {
            if (this.left != null) {
                if (this.left.value == value) {
                    res = this;
                } else {
                    res = this.left.findNodeWithChildrenValue(value);
                }
            }
        } else {
            if (this.right != null) {
                if (this.right.value == value) {
                    res = this;
                } else {
                    res = this.right.findNodeWithChildrenValue(value);
                }
            }
        }

        return res;

    }
}
