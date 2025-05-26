package generics.application;

import generics.service.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();

        System.out.print("How many values? ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            int value = sc.nextInt();
            printService.addValue(value);
        }

        printService.print();

        System.out.println("First: " + printService.first());

        sc.close();
    }
}
