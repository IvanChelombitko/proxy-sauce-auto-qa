package ua.solvd.psaq.page.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.psaq.page.CheckoutCompletePageBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = CheckoutCompletePageBase.class)
public class DesktopCheckoutCompletePage extends CheckoutCompletePageBase {
    public DesktopCheckoutCompletePage(WebDriver driver) {
        super(driver);
    }
}