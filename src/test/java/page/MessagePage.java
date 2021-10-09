package page;

public interface MessagePage {

    void openDialog();

    String sendTextMessage();

    void checkMessageExists(String message);
}
