package default_methods.services;

public class BrazilInterestService implements InterestService {

    private final double interestRate;

    public BrazilInterestService(Double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
