package page;

import page.base.Page;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPageImpl extends Page implements LoginPage {

    public LoginPageImpl() {
    }

    @Override
    public FeedPage login(String login, String password) {
        enterLogin(login);
        enterPassword(password);
        clickLoginButton();
        return new FeedPageImpl();
    }

    @Override
    public void enterLogin(String login) {
        $(byXpath(".//*[@id='field_email']")).setValue(login);
    }

    @Override
    public void enterPassword(String password) {
        $(byXpath(".//*[@id='field_password']")).setValue(password);
    }

    @Override
    public void clickLoginButton() {
        $(byXpath(".//*[@data-l='t,sign_in']")).click();
    }

    @Override
    public void load() {
        open("https://ok.ru");
    }

    @Override
    public boolean isLoaded() {
        return $(byXpath(".//*[@id='field_password']")).isDisplayed()
                && $(byXpath(".//*[@id='field_email']")).isDisplayed()
                && $(byXpath(".//*[@data-l='t,sign_in']")).isDisplayed();
    }
}
