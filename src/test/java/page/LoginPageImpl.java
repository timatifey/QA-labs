package page;

import org.openqa.selenium.By;
import page.base.Page;
import sources.Utils;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPageImpl extends Page implements LoginPage {

    private final static By EMAIL_FIELD = byXpath(".//*[@id='field_email']");
    private final static By PASSWORD_FIELD = byXpath(".//*[@id='field_password']");
    private final static By SIGN_IN_BUTTON = byXpath(".//*[@data-l='t,sign_in']");

    public LoginPageImpl() {
        super();
    }

    @Override
    protected void check() {
        Utils.checkPresentAndVisibility("EMAIL_FIELD isn't visible", EMAIL_FIELD);
        Utils.checkPresentAndVisibility("", PASSWORD_FIELD);
        Utils.checkPresentAndVisibility("", SIGN_IN_BUTTON);
    }

    @Override
    public FeedPage login(String login, String password) {
        Utils.sendKeys(EMAIL_FIELD, login);
        Utils.sendKeys(PASSWORD_FIELD, password);
        Utils.click(SIGN_IN_BUTTON);
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
}
