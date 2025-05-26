package model.application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramContract {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.print("Enter contract value: ");
        double value = sc.nextDouble();

        Contract contract = new Contract(number, date, value);

        System.out.print("Enter number of installments: ");
        int installmentsNumber = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, installmentsNumber);

        System.out.println("Installments: ");
        for(Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }




        sc.close();
    }
}
