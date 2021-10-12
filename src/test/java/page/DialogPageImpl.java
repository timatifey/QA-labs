package page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import page.base.Page;
import sources.Utils;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DialogPageImpl extends Page implements DialogPage {

    private final static By INPUT_BUTTON = By.xpath(".//*[@data-tsid='write_msg_input']");
    private final static By MSG_COLLECTION = By.xpath(".//*[@data-tsid='message_text']");


    public DialogPageImpl() {
    }

    @Override
    public void enterMessage(String msg) {
        $(INPUT_BUTTON).setValue(msg);
    }

    @Override
    public String sendMessage() {
        String msg = $(INPUT_BUTTON).getText();
        $(INPUT_BUTTON).pressEnter();
        return msg;
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
        Utils.checkPresentAndVisibility("", INPUT_BUTTON);
    }
}
