package ua.solvd.psaq.util;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import ua.solvd.psaq.constant.Constants;

public final class AuthUtil {
    private AuthUtil() {
    }

    public static void loginViaCookie(WebDriver driver) {
        driver.get(Constants.BASE_URL);
        Cookie sessionCookie = new Cookie(Constants.SESSION_COOKIE_NAME, Constants.STANDARD_USER);
        driver.manage().addCookie(sessionCookie);
    }
}