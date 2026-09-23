package ua.solvd.psaq;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.solvd.psaq.constant.Constants;
import ua.solvd.psaq.model.CheckoutData;
import ua.solvd.psaq.page.CheckoutCompletePageBase;
import ua.solvd.psaq.page.InventoryPageBase;
import ua.solvd.psaq.util.AuthUtil;
import ua.solvd.psaq.util.CheckoutDataProvider;

public class CheckoutProxyTest extends BaseTest {

    @Test
    public void testCheckoutWithProxyCookies() {
        AuthUtil.loginViaCookie(getDriver());
        InventoryPageBase inventoryPage = initPage(getDriver(), InventoryPageBase.class);
        inventoryPage.open();
        Assert.assertTrue(inventoryPage.isPageOpened(), "Inventory page was not opened after cookie injection.");
        CheckoutData checkoutData = CheckoutDataProvider.getDefaultCheckoutData();
        CheckoutCompletePageBase checkoutCompletePage = inventoryPage
                .clickFirstAddToCartButton()
                .getHeader()
                .clickCartIcon()
                .clickCheckoutButton()
                .fillCheckoutInfo(checkoutData)
                .clickFinishButton();
        String actualCompleteMessage = checkoutCompletePage.getCompleteMessage();
        Assert.assertEquals(actualCompleteMessage, Constants.SUCCESS_ORDER_MESSAGE,
                "The successful order message does not match expected.");
    }
}