package cases;

import org.junit.jupiter.api.Test;

import page.MessagePage;
import page.ProfilePage;
import sources.Navigate;

public class SendMessageTest extends BaseTest {

    @Test
    public void checkSendMessageTest() {

        ProfilePage bot2Page = Navigate.openProfilePage(BOT1.getUsername(), BOT1.getPassword(), BOT2_URL);
        MessagePage messageBot1Page = bot2Page.openDialogWithThisProfile();
        String message = messageBot1Page.sendTextMessage();

        Navigate.logOut();

        ProfilePage bot1Page = Navigate.openProfilePage(BOT2.getUsername(), BOT1.getPassword(), BOT1_URL);
        MessagePage messageBot2Page = bot1Page.openDialogWithThisProfile();
        messageBot2Page.checkMessageExists(message);
    }
}
