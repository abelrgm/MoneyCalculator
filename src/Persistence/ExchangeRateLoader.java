package Persistence;

import Model.Currency;
import Model.ExchangeRate;

/**
 *
 * @author Abel
 */
public interface ExchangeRateLoader {
    ExchangeRate getExchangeRate(Currency from, Currency to);
}
