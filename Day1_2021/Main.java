package Day1_2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {

            File input = new File("Day1_2021\\input");
            Scanner scanner = new Scanner(input);

            int previousInput = scanner.nextInt();
            int countIncreases = 0;

            while (scanner.hasNextInt()) {
                int currentDepth = scanner.nextInt();

                if ( currentDepth > previousInput ) {
                    countIncreases++;
                }
                previousInput = currentDepth;
            }

            System.out.println(countIncreases);
        } catch (FileNotFoundException fileE) {
            System.out.println(fileE.toString());
        }
    }
}
