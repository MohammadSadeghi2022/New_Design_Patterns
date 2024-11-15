package Structural.Decorator.ex2;

public class Main {
    public static void main(String[] args) {
        LoanProcessor loanProcessor = new BasicLoanProcessor();

        loanProcessor = new ValidationDecorator(loanProcessor);
        loanProcessor = new FeeCalculationDecorator(loanProcessor);
        loanProcessor.processLoan("Ali", 123000);
    }
}
