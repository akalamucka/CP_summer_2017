/**
 * Created by ak63575 on 3/22/2017.
 */

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class TextFileRead {

    public static void main(String[] args) {
        throw FileNotFoundException
        /*
        System.out.println("Please provide input");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println();
        */
    }
try

    {
        File myFile = new File("H:\\file.txt");
        Scanner scanner = new Scanner(myFile);
        int i = 0;
        while (scanner.hasNext()) {
            String currLine = scanner.nextLine();
            System.out.println(i + ":" + currLine);
            i++;
        } catch(FileNotFoundException fe){
        System.out.println("Problem occurred: "
                + fe.getMessage);
    }

    }

}
