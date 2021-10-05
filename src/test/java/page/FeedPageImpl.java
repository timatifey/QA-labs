package page;

import org.openqa.selenium.WebDriver;
import page.base.LoadablePage;
import page.base.Page;

public class FeedPageImpl extends Page implements LoadablePage {

    protected FeedPageImpl() {
    }

    @Override
    public void load() {

    }

    @Override
    public boolean isLoaded() {
        return false;
    }
}
