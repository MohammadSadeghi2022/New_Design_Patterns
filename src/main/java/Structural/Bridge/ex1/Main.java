package Structural.Bridge.ex1;

public class Main {
    public static void main(String[] args) {

        //////////////////////Loan Service//////////////////////////////////////
        BankingService loanservice=new LoanService(new SMSNotification());
        loanservice.sendNotification("pay your debt");

        BankingService loanservice2=new LoanService(new EmailNotification());
        loanservice.sendNotification("pay your debt");

        ////////////////////////AccountService//////////////////////////////////////////
        BankingService accountService=new AccountService(new SMSNotification());
        accountService.sendNotification("pay your debt");

        BankingService accountService2=new AccountService(new EmailNotification());
        accountService2.sendNotification("pay your debt");
    }
}
