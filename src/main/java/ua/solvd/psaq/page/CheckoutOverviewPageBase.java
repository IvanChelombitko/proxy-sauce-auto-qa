package ua.solvd.psaq.page;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class CheckoutOverviewPageBase extends BasePage {

    @FindBy(id = "finish")
    protected ExtendedWebElement finishButton;

    public CheckoutOverviewPageBase(WebDriver driver) {
        super(driver);
    }

    public CheckoutCompletePageBase clickFinishButton() {
        finishButton.click();
        return initPage(getDriver(), CheckoutCompletePageBase.class);
    }
}