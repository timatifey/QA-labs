package page;

public interface DialogPage {

    void enterMessage(String msg);

    String sendMessage();

    boolean isMessageExists(String msg);

}
