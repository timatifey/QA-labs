package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;
import page.base.Page;
import sources.Utils;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class DialogPageImpl extends Page implements DialogPage {

    private final static By INPUT_BUTTON = By.xpath(".//*[@data-tsid='write_msg_input']");

    private final SelenideElement msgInputElement = $(".//*[@data-tsid='write_msg_input']");
    private final ElementsCollection msgCollection = $$(".//*[@data-tsid='message_text']");


    public DialogPageImpl() {
    }

    @Override
    public void enterMessage(String msg) {
        msgInputElement.setValue(msg);
    }

    @Override
    public String sendMessage() {
        String msg = msgInputElement.getText();
        msgInputElement.pressEnter();
        return msg;
    }

    @Override
    public boolean isMessageExists(String msg) {
        for (SelenideElement selenideElement : msgCollection) {
            String value = selenideElement.getValue();
            if (msg.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void check() {
        msgInputElement.isDisplayed();
    }
}
