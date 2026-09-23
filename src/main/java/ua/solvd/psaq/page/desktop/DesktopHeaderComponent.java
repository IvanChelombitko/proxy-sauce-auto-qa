package ua.solvd.psaq.page.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import ua.solvd.psaq.page.HeaderComponentBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HeaderComponentBase.class)
public class DesktopHeaderComponent extends HeaderComponentBase {
    public DesktopHeaderComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}