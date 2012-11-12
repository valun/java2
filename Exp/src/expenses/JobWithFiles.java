/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author valtut
 */
public class JobWithFiles {

    public void wriiteToFile() throws Exception {

        String bytesToWrite = "42543";
        String fileName = "c:\\test.txt";
        byte[] bytesReaded = bytesToWrite.getBytes();

        try {
            FileOutputStream outFile = new FileOutputStream(fileName);
            System.out.println("File is open to write");
            // записать массив
            outFile.write(bytesReaded);
            System.out.println("Written: " + bytesToWrite + " byte");
            // по окончании использования должен быть закрыт
            outFile.close();
            //System.out.println("Output stream is closed");
            // создать входной поток
            FileInputStream inFile = new FileInputStream(fileName);
            //System.out.println("File is open to read");
            // узнать, сколько байт готово к считыванию
            int bytesAvailable = inFile.available();
            System.out.println("Ready to read: " + bytesAvailable + " byte");
            // считать в массив
            int count = inFile.read(bytesReaded, 0, bytesAvailable);
            System.out.println("Read: " + count + " byte");
            for (int j = 0; j < count; j++) {
                System.out.print(bytesReaded[j] + ",");
            }
            System.out.println();
            inFile.close();
            System.out.println("Input stream is closed");



        } catch (FileNotFoundException e) {
            System.out.println("Its impossible to write to file: " + fileName);
        }

    }

    public void readWithFile() {
    }
}
