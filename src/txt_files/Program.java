package txt_files;

import java.io.File;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String stgPath = scanner.nextLine();

        File path = new File(stgPath);

        System.out.println("get name: " + path.getName());
        System.out.println("get parent: " + path.getParent());
        System.out.println("get path: " + path.getPath());



        scanner.close();
    }
}
