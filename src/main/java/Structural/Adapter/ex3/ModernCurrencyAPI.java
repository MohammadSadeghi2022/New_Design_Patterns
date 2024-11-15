package Structural.Adapter.ex3;

// New Currency Conversion API
public class ModernCurrencyAPI {
    public double getConversionRate(String fromCurrency, String toCurrency) {
        // Simulating a call to an external service that provides up-to-date rates
        if (fromCurrency.equals("USD") && toCurrency.equals("EUR")) {
            return 0.84; // Example rate
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("USD")) {
            return 1.19; // Example rate
        }
        return 1.0; // Default if unsupported
    }
}
