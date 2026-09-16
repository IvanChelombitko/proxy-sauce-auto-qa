package ua.solvd.psaq.page;

import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class BasePageCommon extends AbstractPage implements ICustomTypePageFactory {
    protected BasePageCommon(WebDriver driver) {
        super(driver);
    }

    public abstract HeaderComponentBase getHeader();
}