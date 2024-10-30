package model.entities;

import java.time.LocalDateTime;


public class CarRental {
    private LocalDateTime start;
    private LocalDateTime finish;

    private Vehicle vehicle = new Vehicle();
    private Invoice invoice = new Invoice();

    public CarRental() {
    }

    public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;

    }

    public LocalDateTime start() {
        return start;
    }

    public CarRental setStart(LocalDateTime start) {
        this.start = start;
        return this;
    }

    public LocalDateTime finish() {
        return finish;
    }

    public CarRental setFinish(LocalDateTime finish) {
        this.finish = finish;
        return this;
    }

    public Vehicle vehicle() {
        return vehicle;
    }

    public CarRental setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public Invoice invoice() {
        return invoice;
    }

    public CarRental setInvoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }
}
