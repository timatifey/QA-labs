package page;

import org.openqa.selenium.By;
import page.base.Page;
import sources.Utils;

public class ProfilePageImpl extends Page implements ProfilePage {

    private static final By MESSAGE_WITH_THIS_PROFILE = By.xpath("//*[@id='hook_Block_MainMenu']/div/ul/li[2]/a");

    public ProfilePageImpl() {
        super();
    }

    @Override
    protected void check() {

    }

    @Override
    public DialogPage openDialogWithThisProfile() {
        Utils.click(MESSAGE_WITH_THIS_PROFILE);
        return new DialogPageImpl();
    }
}
