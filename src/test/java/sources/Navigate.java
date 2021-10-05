package sources;

import page.FeedPage;
import page.LoginPage;
import page.LoginPageImpl;
import page.MessagePage;

public class Navigate {

    public static FeedPage doLogin(final String username, final String password) {
        LoginPage loginPage = new LoginPageImpl();
        return loginPage.login(username, password);
    }

    public static MessagePage openMessagePage(final String username, final String password) {
        return doLogin(username, password).openMessagePage();
    }
}
