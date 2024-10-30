package model.application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxServices;
import model.services.RentalServices;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ProgramCarRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro: ");
        String modelCar = scanner.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm)");
        LocalDateTime start = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        System.out.print("Retorno (dd/MM/yyyy hh:mm)");
        LocalDateTime finish = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        CarRental carRental = new CarRental(start, finish, new Vehicle(modelCar));

        System.out.print("Entre com o preço por hora: ");
        double valuePerHour = scanner.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double valuePerDay = scanner.nextDouble();

        RentalServices rentalServices = new RentalServices(valuePerHour, valuePerDay, new BrazilTaxServices());

        rentalServices.processInvoice(carRental);

        System.out.println("Fatura: ");
        System.out.println("Pagamento Basico: " + carRental.invoice().basicPayments());
        System.out.println("Imposto: " + carRental.invoice().tax());
        System.out.println("Pagamento total: " + carRental.invoice().totalPayment());



        scanner.close();

    }
}
