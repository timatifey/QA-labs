package page;

import org.openqa.selenium.WebDriver;

import page.base.Page;

public class LoginPageImpl extends Page implements LoginPage {

    public LoginPageImpl(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean login(String login, String password) {
        return false;
    }

    @Override
    public void enterLogin(String login) {

    }

    @Override
    public void enterPassword(String password) {

    }

    @Override
    public void clickLoginButton() {

    }

    @Override
    public void load() {

    }

    @Override
    public boolean isLoaded() {
        return false;
    }
}
