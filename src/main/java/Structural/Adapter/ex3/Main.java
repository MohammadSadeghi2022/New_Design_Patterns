package Structural.Adapter.ex3;

public class Main {

    public static void main(String[] args) {
        CurrencyAdapter adapter = new CurrencyAdapter(new ModernCurrencyAPI());
       double amoutn= adapter.convertCurrency(200, "EUR", "USD");
        System.out.println(amoutn);
    }
}
