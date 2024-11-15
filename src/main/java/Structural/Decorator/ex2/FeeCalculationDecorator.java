package Structural.Decorator.ex2;

public class FeeCalculationDecorator extends LoanProcessorDecorator {

    public FeeCalculationDecorator(LoanProcessor decoratedProcessor) {
        super(decoratedProcessor);
    }

    @Override
    public void processLoan(String customerName, double loanAmount) {
        calculateFees(loanAmount);
        super.processLoan(customerName, loanAmount);
    }

    private void calculateFees(double loanAmount) {
        double fee = loanAmount * 0.01; // 1% processing fee
        System.out.println("Calculated processing fee: $" + fee);
    }
}
