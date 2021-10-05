package page;

import org.openqa.selenium.WebDriver;

import page.base.Page;

public class DialogPageImpl extends Page implements DialogPage {

    public DialogPageImpl() {
    }

    @Override
    public void enterMessage(String msg) {

    }

    @Override
    public void sendMessage() {

    }

    @Override
    public boolean isMessageExists(String author, String msg) {
        return false;
    }

    @Override
    public void load() {

    }

    @Override
    public boolean isLoaded() {
        return false;
    }
}
