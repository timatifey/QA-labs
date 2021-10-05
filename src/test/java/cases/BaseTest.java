package cases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import sources.Bot;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    private static final String BASE_URL = "http://ok.ru";
    protected static final Bot BOT = new Bot("TechoBot3", "TechnoPolis19");

    @BeforeEach
    public void setUp() {
        //open(BASE_URL);
    }

    @AfterEach
    public void closeAll() {
        closeWebDriver();
    }

}
