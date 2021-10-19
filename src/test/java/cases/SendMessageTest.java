package cases;

import org.junit.jupiter.api.Test;
import page.DialogPage;
import page.ProfilePage;
import sources.Bots;
import sources.Navigate;

public class SendMessageTest extends BaseTest {

    @Test
    public void checkSendMessageTest() {
        DialogPage dialogPage;

        ProfilePage bot2ProfilePage = Navigate.openProfilePage(Bots.number1.username, Bots.number1.password, Bots.number2.url);
        dialogPage = bot2ProfilePage.openDialogWithThisProfile();
        String messageText = "Hello";
        dialogPage.sendMessage(messageText);

        Navigate.logOut();

        ProfilePage bot1ProfilePage = Navigate.openProfilePage(Bots.number2.username, Bots.number2.password, Bots.number1.url);
        dialogPage = bot1ProfilePage.openDialogWithThisProfile();
        dialogPage.isMessageExists(messageText);
    }
}
