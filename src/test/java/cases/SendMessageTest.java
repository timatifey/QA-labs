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

        FeedPage bot1SelfPage = Navigate.doLogin(BOT1.getUsername(), BOT1.getPassword());
        ProfilePage bot2ProfilePage = bot1SelfPage.openPage(BOT2_PROFILE_URL);
        dialogPage = bot2ProfilePage.openDialogWithThisProfile();
        String messageText = dialogPage.sendMessage();

        Navigate.logOut();

        FeedPage bot2SelfPage = Navigate.doLogin(BOT2.getUsername(), BOT2.getPassword());
        ProfilePage bot1ProfilePage = bot2SelfPage.openPage(BOT1_PROFILE_URL);
        dialogPage = bot1ProfilePage.openDialogWithThisProfile();
        dialogPage.isMessageExists(messageText);
    }
}
