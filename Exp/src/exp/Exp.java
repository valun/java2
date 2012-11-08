/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exp;

import java.util.*;
import java.util.Scanner;


/**
 *
 * @author valtut
 */
public class Exp {

    public static void main(String[] args) {
        
       Elem el = new Elem();
       List<Elem> list = new ArrayList<Elem>();
       el.addExp(el);
       el.show(list);
       
    }
}
