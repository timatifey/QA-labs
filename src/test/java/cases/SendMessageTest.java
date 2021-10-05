package cases;

import org.junit.jupiter.api.Test;

import page.DialogPage;
import page.DialogPageImpl;
import page.MessagePage;
import sources.Navigate;

public class SendMessageTest extends BaseTest {

    @Test
    public void checkSendMessageTest() {
        MessagePage messagePage = Navigate.openMessagePage(BOT.getUsername(), BOT.getPassword());
        DialogPage dialogPage = new DialogPageImpl("url");
    }
}
