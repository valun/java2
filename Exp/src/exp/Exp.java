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


        Elem ee = new Elem();
        ee.addExp(ee);
        ee.addExp(ee);
        ee.show(ee.list);

    }
}
