package Persistence;

import Model.Currency;
import java.util.List;

/**
 *
 * @author Abel
 */
public interface CurrencyLoader {
    List<Currency> load();
}
