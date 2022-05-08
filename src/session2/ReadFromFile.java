package session2;

import java.io.*;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) throws IOException {


    }


    public static void readFromFileBetter(String fileLocation){
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileLocation));
            String line = br.readLine();

            while (line != null) {

                line = br.readLine();
                System.out.println(line);

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readFromFile(String fileLocation) throws FileNotFoundException{
//        try{
            File file = new File(fileLocation);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }

    public static void readSomething(String location) throws FileNotFoundException{
        readFromFile(location);
    }

    public static void read(String location) throws FileNotFoundException{

        readSomething(location);

    }




}
