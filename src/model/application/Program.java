package model.application;

import model.entities.Account;
import model.exceptions.AccountException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        int number;
        String holder;
        double balance;
        double withdrawLimit;

        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            number = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Holder: ");
            holder = scanner.nextLine();
            System.out.print("Initial balance: ");
            balance = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Withdraw limit: ");
            withdrawLimit = scanner.nextDouble();
            scanner.nextLine();
            Account account = new Account(number, holder, balance, withdrawLimit);
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amountForWithdraw = scanner.nextDouble();
            account.withdraw(amountForWithdraw);

            System.out.print("New balance: " + account.balance());
        } catch (AccountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }
    }
}