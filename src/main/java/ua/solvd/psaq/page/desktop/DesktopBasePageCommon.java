package ua.solvd.psaq.page.desktop;

import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.psaq.page.BasePageCommon;
import ua.solvd.psaq.page.HeaderComponentBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = BasePageCommon.class)
public class DesktopBasePageCommon extends BasePageCommon {

    @FindBy(xpath = "//div[@class='primary_header']")
    private DesktopHeaderComponent header;

    public DesktopBasePageCommon(WebDriver driver) {
        super(driver);
    }

    @Override
    public HeaderComponentBase getHeader() {
        return header;
    }
}