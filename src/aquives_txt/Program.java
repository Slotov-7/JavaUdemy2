package aquives_txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("G:\\in.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
