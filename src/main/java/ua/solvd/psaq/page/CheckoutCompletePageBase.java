package ua.solvd.psaq.page;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class CheckoutCompletePageBase extends BasePage {

    @FindBy(xpath = "//h2[@class='complete-header']")
    protected ExtendedWebElement completeHeader;

    public CheckoutCompletePageBase(WebDriver driver) {
        super(driver);
    }

    public String getCompleteMessage() {
        return completeHeader.getText();
    }
}