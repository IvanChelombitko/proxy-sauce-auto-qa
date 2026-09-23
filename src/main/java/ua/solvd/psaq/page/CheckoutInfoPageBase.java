package ua.solvd.psaq.page;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.psaq.model.CheckoutData;

public abstract class CheckoutInfoPageBase extends BasePage {

    @FindBy(id = "first-name")
    protected ExtendedWebElement firstNameInput;

    @FindBy(id = "last-name")
    protected ExtendedWebElement lastNameInput;

    @FindBy(id = "postal-code")
    protected ExtendedWebElement postalCodeInput;

    @FindBy(id = "continue")
    protected ExtendedWebElement continueButton;

    public CheckoutInfoPageBase(WebDriver driver) {
        super(driver);
    }

    public CheckoutOverviewPageBase fillCheckoutInfo(CheckoutData checkoutData) {
        firstNameInput.type(checkoutData.firstName());
        lastNameInput.type(checkoutData.lastName());
        postalCodeInput.type(checkoutData.postalCode());
        continueButton.click();
        return initPage(getDriver(), CheckoutOverviewPageBase.class);
    }
}