package Structural.Decorator.ex2;

public abstract class LoanProcessorDecorator implements LoanProcessor {

    private LoanProcessor decorator;

    public LoanProcessorDecorator(LoanProcessor decorator) {
        this.decorator = decorator;
    }

    @Override
    public void processLoan(String customerName, double loanAmount) {
        decorator.processLoan(customerName, loanAmount);
    }
}
