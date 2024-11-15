package Structural.Decorator.ex1;

public class BasicBankAccount implements BankAccount {

    private double balance;

    public BasicBankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal of $" + amount + " failed.");
        }
    }
}
