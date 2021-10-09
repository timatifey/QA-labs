package sources;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import org.openqa.selenium.NoSuchElementException;

public class Utils {

    public static void click(By locator) {
        Selenide.$(locator).click();
    }

    public static void sendKeys(By locator, final @NotNull String keys) {
        checkPresentAndVisibility("Can't send key in invisible element" + locator.toString(), locator);
        Selenide.$(locator).sendKeys(keys);
    }

    public static void checkPresentAndVisibility(String message, By locator) {
        Assertions.assertTrue(isElementPresent(locator) && isElementVisible(locator), message);
    }

    private static boolean isElementVisible(By locator) {
        try {
            Selenide.$(locator).shouldBe(Condition.visible);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }
    }

    private static boolean isElementPresent(By locator) {
        try {
            Selenide.$(locator).shouldBe(Condition.exist);
            return true;
        } catch (NoSuchElementException exception) {
            return false;
        }
    }
}
