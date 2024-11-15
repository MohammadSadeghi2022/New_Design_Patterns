package Structural.Adapter.ex3;

// Adapter Class
public class CurrencyAdapter implements CurrencyExchangeAPI {
    private LegacyCurrencyConverter legacyConverter;
    private ModernCurrencyAPI modernAPI;

    public CurrencyAdapter(LegacyCurrencyConverter legacyConverter) {
        this.legacyConverter = legacyConverter;
    }

    public CurrencyAdapter(ModernCurrencyAPI modernAPI) {
        this.modernAPI = modernAPI;
    }

    @Override
    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        if (legacyConverter != null) {
            return legacyConverter.convertCurrency(fromCurrency, toCurrency, amount);
        } else if (modernAPI != null) {
            double rate = modernAPI.getConversionRate(fromCurrency, toCurrency);
            return amount * rate;
        }
        return amount; // No conversion if unsupported
    }
}
