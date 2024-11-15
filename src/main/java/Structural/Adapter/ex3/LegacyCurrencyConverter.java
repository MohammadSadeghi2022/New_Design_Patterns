package Structural.Adapter.ex3;

// Legacy Class
public class LegacyCurrencyConverter {
    public double convertCurrency(String from, String to, double amount) {
        // Assume a hardcoded conversion for simplicity (e.g., 1 USD = 0.85 EUR)
        if (from.equals("USD") && to.equals("EUR")) {
            return amount * 0.85;
        } else if (from.equals("EUR") && to.equals("USD")) {
            return amount * 1.18;
        }
        // Other conversions can be added as needed
        return amount; // No conversion if unsupported
    }
}
