package model.services;

public class PaypalService implements OnlinePaymentService{
    private OnlinePaymentService paymentService;

    @Override
    public double paymentFee(Double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(Double amount, Integer months) {
        Double taxRate = 0.01;
        return amount * taxRate * months;
    }
}
