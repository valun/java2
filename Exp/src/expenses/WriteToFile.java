/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author valtut
 */
public class WriteToFile {

    String fileName = "c:\\test.txt";

    public void writeToFile(Elem e) throws IOException {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            BufferedWriter buffered = new BufferedWriter(writer);
            buffered.append(e.data + " " + e.sum + "      " + e.des + '\n');
            buffered.flush();
        } catch (IOException a) {
            System.out.println("");
        }
    }
}