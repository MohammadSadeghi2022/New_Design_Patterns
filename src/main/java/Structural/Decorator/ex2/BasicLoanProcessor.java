package Structural.Decorator.ex2;

public class BasicLoanProcessor implements LoanProcessor {

    @Override
    public void processLoan(String customerName, double loanAmount) {
        System.out.println("Processing loan for " + customerName + " for an amount of $" + loanAmount);
    }
}
