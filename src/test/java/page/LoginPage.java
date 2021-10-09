package page;

public interface LoginPage {

    FeedPage login(String login, String password);

    void enterLogin(String login);

    void enterPassword(String password);

    void clickLoginButton();

}