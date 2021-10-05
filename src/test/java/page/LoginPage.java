package page;

import page.base.LoadablePage;

public interface LoginPage extends LoadablePage {

    boolean login(String login, String password);

    void enterLogin(String login);

    void enterPassword(String password);

    void clickLoginButton();

}