package derevo1;

import derevo1.NodesTree;

/**
 *
 * @author valtut
 */
public class Derevo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NodesTree derevo = new NodesTree();
        
        derevo.addElement(10);
        derevo.addElement(4);
        derevo.addElement(18);
        derevo.addElement(16);
        derevo.addElement(6);
        derevo.addElement(3);
        derevo.addElement(5);
        derevo.addElement(7);
        derevo.delElement(6);
        derevo.showTree();
        
        // TODO code application logic here
    }
}