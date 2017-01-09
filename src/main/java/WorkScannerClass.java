import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Maxim on 26.10.2016.
 */
public class WorkScannerClass {

    public static void main(String[] args) throws FileNotFoundException {

        //Read input data from console
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(string);
        String string2 = sc.nextLine();
        System.out.println(string2);



        //
       /* Scanner scFile = new Scanner(new File("C://temp/scan.txt"));
        while (scFile.hasNextLine()) {
            System.out.print(scFile.nextLine() + "\n");
        }
        scFile.close();*/

    }
}
