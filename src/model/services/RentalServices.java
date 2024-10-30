package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

import java.time.Duration;

public class RentalServices {
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalServices(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double pricePerHour() {
        return pricePerHour;
    }

    public RentalServices setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
        return this;
    }

    public Double pricePerDay() {
        return pricePerDay;
    }

    public RentalServices setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
        return this;
    }

    public TaxService taxService() {
        return taxService;
    }

    public RentalServices setBrazilTaxServices(BrazilTaxServices brazilTaxServices) {
        this.taxService = brazilTaxServices;
        return this;
    }
    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.start(), carRental.finish()).toMinutes();
        double hours = minutes/60;

        double basicPayment;

        if(hours <= 12.0){
            basicPayment = pricePerHour() * Math.ceil(hours);
        }else{
            basicPayment = pricePerDay() * Math.ceil(hours/24);
        }
        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
