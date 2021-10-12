package sources;

import org.openqa.selenium.By;
import page.FeedPage;
import page.LoginPage;
import page.LoginPageImpl;
import page.ProfilePage;

public class Navigate {

    private final static By MICRO_MENU_BUTTON = By.xpath("//*[@id='hook_Block_ToolbarUserDropdown']/div/div[1]");
    private final static By LOGOUT_BUTTON = By.xpath("//*[@id='hook_Block_ToolbarUserDropdown']/div/div[2]/div/div[1]/div[1]/a");
    private final static By CONFIRM_LOGOUT_BUTTON = By.xpath("//*[@id='hook_FormButton_logoff.confirm_not_decorate']");

    public static FeedPage doLogin(final String username, final String password) {
        LoginPage loginPage = new LoginPageImpl();
        return loginPage.login(username, password);
    }

    public static void logOut() {
        Utils.click(MICRO_MENU_BUTTON);
        Utils.click(LOGOUT_BUTTON);
        Utils.click(CONFIRM_LOGOUT_BUTTON);
    }
}
