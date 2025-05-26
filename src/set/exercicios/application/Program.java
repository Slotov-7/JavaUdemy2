package set.exercicios.application;

import set.exercicios.entities.User;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<User> users = new HashSet<>();

        readStudents(sc, users, "A");
        readStudents(sc, users, "B");
        readStudents(sc, users, "C");

        System.out.println("Total students: " + users.size());
    }

    private static void readStudents(Scanner sc, Set<User> users, String courseName) {
        System.out.print("How many students for course " + courseName + "? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            users.add(new User(id));
        }

    }
}
