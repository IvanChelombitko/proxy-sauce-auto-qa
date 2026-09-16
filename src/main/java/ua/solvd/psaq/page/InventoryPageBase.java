package ua.solvd.psaq.page;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class InventoryPageBase extends BasePage {

    @FindBy(xpath = "(//button[contains(@class, 'btn_inventory')])[1]")
    protected ExtendedWebElement firstAddToCartButton;

    public InventoryPageBase(WebDriver driver) {
        super(driver);
    }

    public InventoryPageBase clickFirstAddToCartButton() {
        firstAddToCartButton.click();
        return initPage(getDriver(), InventoryPageBase.class);
    }
}