package page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import page.base.Page;
import sources.Utils;

import static com.codeborne.selenide.Selenide.*;

public class DialogPageImpl extends Page implements DialogPage {

    private final static By MSG_INPUT = By.xpath(".//*[@data-tsid='write_msg_input']");
    private final static By SEND_BTN = By.xpath(".//*[@data-tsid='button_send']");
    private final static By MSG_COLLECTION = By.xpath(".//*[@data-tsid='message_text']");

    public DialogPageImpl() {
    }

    @Override
    public void sendMessage(String msg) {
        Utils.sendKeys(MSG_INPUT, msg);
        Utils.click(SEND_BTN);
    }

    @Override
    public boolean isMessageExists(String msg) {
        for (SelenideElement selenideElement : $$(MSG_COLLECTION)) {
            String value = selenideElement.getValue();
            if (msg.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void check() {
        sleep(3000);
        Selenide.actions().sendKeys("11111111111111111111111111");
        sleep(3000);
        Utils.checkPresentAndVisibility("", MSG_INPUT);
        Utils.checkPresentAndVisibility("", SEND_BTN);
    }
}
