package Structural.Decorator.ex1;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BasicBankAccount(2000);


        account = new LoggingDecorator(account);
        account = new AuditingDecorator(account);


        account.withdraw(500);

    }
}
