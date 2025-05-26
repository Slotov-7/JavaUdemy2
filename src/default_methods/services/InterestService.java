package default_methods.services;

public interface InterestService {

    double getInterestRate();

    default double payment(double amount, int months) {
        if (months < 1){
            throw new IllegalArgumentException("Months must be greater than 0");
        }
        return  amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }

}
