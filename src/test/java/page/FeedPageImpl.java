package page;

import org.openqa.selenium.By;
import page.base.Page;
import sources.Utils;

public class FeedPageImpl extends Page implements FeedPage {

    private static final By MSG_TOOLBAR_BUTTON = By.xpath("//*[@id='msg_toolbar_button']");

    protected FeedPageImpl() {
        super();
    }

    @Override
    protected void check() {
        Utils.checkPresentAndVisibility("MSG_TOOLBAR_BUTTON not found", MSG_TOOLBAR_BUTTON);
    }

    @Override
    public DialogPage openDialogPage() {
        Utils.click(MSG_TOOLBAR_BUTTON);
        return new DialogPageImpl();
    }

    @Override
    public ProfilePage openPage(String url) {
        return new ProfilePageImpl();
    }
}
