package ua.solvd.psaq.page;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class CartPageBase extends BasePage {

    @FindBy(id = "checkout")
    protected ExtendedWebElement checkoutButton;

    public CartPageBase(WebDriver driver) {
        super(driver);
    }

    public CheckoutInfoPageBase clickCheckoutButton() {
        checkoutButton.click();
        return initPage(getDriver(), CheckoutInfoPageBase.class);
    }
}