package ua.solvd.psaq.page;

import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class HeaderComponentBase extends AbstractUIObject implements ICustomTypePageFactory {

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    private ExtendedWebElement cartIcon;

    protected HeaderComponentBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public CartPageBase clickCartIcon() {
        cartIcon.click();
        return initPage(getDriver(), CartPageBase.class);
    }
}