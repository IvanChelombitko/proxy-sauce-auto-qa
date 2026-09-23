package ua.solvd.psaq.util;

import ua.solvd.psaq.constant.Constants;
import ua.solvd.psaq.model.CheckoutData;

public final class CheckoutDataProvider {
    private CheckoutDataProvider() {
    }

    public static CheckoutData getDefaultCheckoutData() {
        return new CheckoutData(
                Constants.DEFAULT_FIRST_NAME, 
                Constants.DEFAULT_LAST_NAME, 
                Constants.DEFAULT_POSTAL_CODE
        );
    }
}