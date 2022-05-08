package session2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {


    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);
        System.out.print("please say something nice: ");

        String text = scanner.nextLine();


        BufferedWriter output = null;
        try {
            File file = new File("techcenture.txt");
            output = new BufferedWriter(new FileWriter(file, true));
            output.write(text + "\n");
        } catch ( IOException e ) {
            e.printStackTrace();
        } finally {
            if ( output != null ) {
                output.close();
            }
        }
    }


}
