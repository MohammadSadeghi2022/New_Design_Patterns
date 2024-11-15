package Structural.Decorator.ex2;

public class CreditCheckDecorator extends LoanProcessorDecorator {


    public CreditCheckDecorator(LoanProcessor decorator) {
        super(decorator);
    }

    @Override
    public void processLoan(String customerName, double loanAmount) {
        performCreditCheck(customerName);
        super.processLoan(customerName, loanAmount);

    }
    private void performCreditCheck(String customerName) {
        System.out.println("Performing credit check for " + customerName);
    }
}
