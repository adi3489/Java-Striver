
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Filehandling {
    public static void main(String[] args) {
        //create a new file to creata a new file
//        File myfile = new File("File1.txt");
//        try {
//            myfile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("unable to create this file");
//            e.printStackTrace();
//        }

        //write
//        try {
//            FileWriter filewrite = new FileWriter("File1.txt");
//            filewrite.write("My first file suuiiiiiii \n okey sir suiiiii");
//            filewrite.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
        //Read
        File myFile =new File("File1.txt");
        try {
            Scanner s =new Scanner(myFile);
            while (s.hasNextLine()){
                String line = s.nextLine();
                System.out.println(line);
            }
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
