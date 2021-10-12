package cases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import sources.Bot;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    private static final String BASE_URL = "http://ok.ru";

    protected static final Bot BOT1 = new Bot("TechoBot1", "TechnoPolis19");
    protected static final String BOT1_PROFILE_URL = "https://ok.ru/profile/574152517460";

    protected static final Bot BOT2 = new Bot("TechoBot3", "TechnoPolis19");
    protected static final String BOT2_PROFILE_URL = "https://ok.ru/profile/577417727448";

    @BeforeEach
    public void setUp() {
        open(BASE_URL);
    }

    @AfterEach
    public void closeAll() {
        closeWebDriver();
    }
}
