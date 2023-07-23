package Day2_2021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try  {
            File input = new File("Day2_2021\\input");
            Scanner scanner = new Scanner(input);

        int horizontalPosition = 0;
        int depth = 0;

            while (scanner.hasNext()) {
                String command = scanner.next();
                int value = scanner.nextInt();

                if (command.equals("forward")) {
                    horizontalPosition += value;
                } else if (command.equals("down")) {
                    depth += value;
                } else if (command.equals("up")) {
                    depth -= value;
                }
            }

            scanner.close();

            int result = horizontalPosition * depth;
            System.out.println("horizontal position: " + horizontalPosition);
            System.out.println("Depth: " + depth);
            System.out.println("Result: " + result);
        }
        catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
