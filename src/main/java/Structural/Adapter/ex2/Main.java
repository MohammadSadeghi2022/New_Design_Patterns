package Structural.Adapter.ex2;

// Step 5: Client code to test the adapter.

public class Main {
    public static void main(String[] args) {

        LegacyBankingSystem legacyBankingSystem = new LegacyBankingSystem();
        PaymentAdapter adapter=new PaymentAdapter(legacyBankingSystem);
        adapter.excuteTransaction(new PaymentDetails("1020.511.8000555.5",2034));

    }
}
