package page;

import page.base.LoadablePage;

public interface DialogPage extends LoadablePage {

    void enterMessage(String msg);

    void sendMessage();

    boolean isMessageExists(String author, String msg);

}
