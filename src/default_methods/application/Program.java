package default_methods.application;

import default_methods.services.InterestService;
import default_methods.services.UsaInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        //BrazilInterestService is = new BrazilInterestService(2.0);
        InterestService is = new UsaInterestService(1.0);
        double payment = is.payment(amount, months);

        System.out.printf("Payment: after %d months: %.2f \n", months, payment);

        sc.close();
    }
}
