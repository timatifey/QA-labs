package cases;

import org.junit.jupiter.api.Test;

import page.DialogPage;
import page.FeedPage;
import page.ProfilePage;
import sources.Navigate;

public class SendMessageTest extends BaseTest {

    @Test
    public void checkSendMessageTest() {
        DialogPage dialogPage;

        ProfilePage bot2ProfilePage = Navigate.openProfilePage(BOT1.getUsername(), BOT1.getPassword(), BOT2_PROFILE_URL);
        dialogPage = bot2ProfilePage.openDialogWithThisProfile();
        String messageText = "Hello";
        dialogPage.sendMessage(messageText);

        Navigate.logOut();

        ProfilePage bot1ProfilePage = Navigate.openProfilePage(BOT2.getUsername(), BOT2.getPassword(), BOT1_PROFILE_URL);
        dialogPage = bot1ProfilePage.openDialogWithThisProfile();
        dialogPage.isMessageExists(messageText);
    }
}
