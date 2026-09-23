package ua.solvd.psaq.page;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import ua.solvd.psaq.util.IElementExtractor;

import java.util.List;
import java.util.stream.Collectors;

public abstract class InventoryPageBase extends BasePage {

    @FindBy(xpath = "(//button[contains(@class, 'btn_inventory')])[1]")
    protected ExtendedWebElement firstAddToCartButton;

    @FindBy(xpath = "//div[@class='inventory_item']")
    protected List<ExtendedWebElement> inventoryItems;

    public InventoryPageBase(WebDriver driver) {
        super(driver);
    }

    public InventoryPageBase clickFirstAddToCartButton() {
        firstAddToCartButton.click();
        return initPage(getDriver(), InventoryPageBase.class);
    }

    public InventoryPageBase clickAddToCartByProductName(String productName) {
        inventoryItems.stream()
                .filter(item -> item
                        .findExtendedWebElement(By.className("inventory_item_name"))
                        .getText().equals(productName))
                .findFirst()
                .ifPresent(item -> item
                        .findExtendedWebElement(By.cssSelector("button.btn_inventory"))
                        .click());
        return initPage(getDriver(), InventoryPageBase.class);
    }

    public List<String> getProductNames() {
        IElementExtractor<ExtendedWebElement, String> nameExtractor =
                item -> item
                        .findExtendedWebElement(By.className("inventory_item_name"))
                        .getText();
        return inventoryItems.stream()
                .map(nameExtractor::extract)
                .collect(Collectors.toList());
    }
}