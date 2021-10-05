package cases;

import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import page.DialogPage;
import page.DialogPageImpl;
import page.LoginPage;
import page.LoginPageImpl;

public class SendMessageTest {
    private final WebDriver driver = getWebDriver();
    private final LoginPage loginPage = new LoginPageImpl();
    private final DialogPage dialogPage = new DialogPageImpl("url");
}
