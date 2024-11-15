package Structural.Decorator.ex2;

public class ValidationDecorator extends LoanProcessorDecorator {

    public ValidationDecorator(LoanProcessor decorator) {
        super(decorator);
    }

    @Override
    public void processLoan(String customerName, double loanAmount) {
        validateLoan(customerName, loanAmount);
        super.processLoan(customerName, loanAmount);

    }
    private void validateLoan(String customerName, double loanAmount) {
        System.out.println("Validating loan application for " + customerName + " with amount $" + loanAmount);
    }
}
