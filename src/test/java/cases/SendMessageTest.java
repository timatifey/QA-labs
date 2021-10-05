package cases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import page.DialogPage;
import page.DialogPageImpl;
import page.LoginPage;
import page.LoginPageImpl;
import page.MessagePage;
import sources.Navigate;

public class SendMessageTest extends BaseTest {

    @Test
    public void checkSendMessageTest() {
        MessagePage messagePage = Navigate.openMessagePage(BOT.getUsername(), BOT.getPassword());
        DialogPage dialogPage = new DialogPageImpl();
    }
}
