package ua.solvd.psaq.page;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class BasePage extends AbstractPage {
    public BasePage(WebDriver driver) {
        super(driver);
    }

    public HeaderComponentBase getHeader() {
        BasePageCommon basePageCommon = initPage(getDriver(), BasePageCommon.class);
        return basePageCommon.getHeader();
    }
}