package page;

import org.openqa.selenium.By;
import page.base.Page;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPageImpl extends Page implements LoginPage {

    private final static String BASE_URL = "https://ok.ru";

    private final static By EMAIL_FIELD = byXpath(".//*[@id='field_email']");
    private final static By PASSWORD_FIELD = byXpath(".//*[@id='field_password']");
    private final static By SIGN_IN_BUTTON = byXpath(".//*[@data-l='t,sign_in']");

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
        $(EMAIL_FIELD).setValue(login);
    }

    @Override
    public void enterPassword(String password) {
        $(PASSWORD_FIELD).setValue(password);
    }

    @Override
    public void clickLoginButton() {
        $(SIGN_IN_BUTTON).click();
    }

    @Override
    public void load() {
        open(BASE_URL);
    }

    @Override
    public boolean isLoaded() {
        return $(EMAIL_FIELD).isDisplayed()
                && $(PASSWORD_FIELD).isDisplayed()
                && $(SIGN_IN_BUTTON).isDisplayed();
    }
}
