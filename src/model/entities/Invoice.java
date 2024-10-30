package model.entities;

public class Invoice {
    private Double basicPayments;
    private Double tax;

    public Invoice() {
    }

    public Invoice(Double basicPayments, Double tax) {
        this.basicPayments = basicPayments;
        this.tax = tax;
    }

    public Double basicPayments() {
        return basicPayments;
    }

    public Invoice setBasicPayments(Double basicPayments) {
        this.basicPayments = basicPayments;
        return this;
    }

    public Double tax() {
        return tax;
    }

    public Invoice setTax(Double tax) {
        this.tax = tax;
        return this;
    }
    public Double totalPayment(){
        return basicPayments() + tax();
    }

}
