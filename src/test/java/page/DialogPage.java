package page;

public interface DialogPage {

    void enterMessage(String msg);

    void sendMessage();

    boolean isMessageExists(String author, String msg);

}
