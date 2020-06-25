import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Basics {
    public static void main(String[] args) {

        // ARGUMENTS
        int argc = args.length;
        System.out.printf("Print %d arguments\n", argc);
        for (int i=0; i<argc; i++) {
            System.out.printf("args[%d] : %s\n", i, args[i]);
        }

        // DATA TYPES
        int     a = 10;
        int     b = a / 3;   // can use long or other integer type
        double  c = a / 3.0; // can use float
        boolean d = true;
        char    e = 'a';     // actually similar to integer type
        String  f = "ab";    // array of char

        // ARRAY
        int[]   arr1 = new int[3];          // declare
        int[]   arr2 = { 0, 1, 2 };         // declare and initialize
        int[][] arr3 = new int[3][3];       // declare 2d
        int[][] arr4 = { {0}, {1}, {3} };   // declare and initialize 2d

        // CONDITIONAL
        if (a < 100) {
            System.out.println("a < 100");
        } else if ((a >= 100) && (a <= 200)) {
            System.out.println("a >= 100 and a =< 200");
        } else {
            System.out.println("a > 200");
        }

        // SWITCH CASE
        // `break` to stop checking another condition when matched
        // `default` if there is not match happened
        switch (a) {
            case 10:
                System.out.println("10");
                break;
            default:
                System.out.println("Unknown");
        }

        // LOOP
        for (int i=0; i<10; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        
        int counter = 0;
        while (counter < 10) {
            System.out.printf("%d ", counter);
            counter++;
        }
        System.out.println();
        
        counter = 0;
        do {
            System.out.printf("%d ", counter);
            counter++;
        } while (counter < 10);
        System.out.println();

        // I/O
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int a_int       = input.nextInt();
        input.nextLine(); // for enter
        System.out.println("Got integer : " + a_int);

        System.out.print("Enter a double : ");
        double a_double = input.nextDouble();
        input.nextLine(); // for enter
        System.out.println("Got double : " + a_double);

        System.out.print("Enter a string : ");
        String a_string = input.nextLine();
        System.out.println("Got string : " + a_string);

        System.out.println("Enter multi-line string :");
        String a_multi_line = "";
        String line = input.nextLine();
        while ((!line.equals("")) && (input.hasNextLine())) {
            a_multi_line += line + "\n";
            line = input.nextLine();
        }
        System.out.println("Got string :\n" + a_multi_line);

        // FILE I/O
        // Reading from file input.txt
        File fileIn = new File("input.txt");
        FileInputStream in = null;
        try {
            // Read as Bytes, can read per character also
            in = new FileInputStream(fileIn);
            byte[] fileContent = new byte[(int)fileIn.length()];
            in.read(fileContent);
            in.close();
            String s = new String(fileContent);
            System.out.println(s);
        } catch (Exception err) {
            err.printStackTrace();
        }
        // Writing to file output.txt
        File fileOut = new File("output.txt");
        FileOutputStream out = null;
        try {
            out = new FileOutputStream(fileOut);
            String str = "Hello World!\nLowell is Here";
            byte strBytes[] = str.getBytes();
            out.write(strBytes);
            out.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}