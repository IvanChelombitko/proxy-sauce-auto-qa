package ua.solvd.psaq.page.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import ua.solvd.psaq.page.InventoryPageBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = InventoryPageBase.class)
public class DesktopInventoryPage extends InventoryPageBase {
    public DesktopInventoryPage(WebDriver driver) {
        super(driver);
    }
}