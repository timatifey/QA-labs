package page;

public interface FeedPage {

    MessagePage openMessagePage();

    ProfilePage openPage(String url);
}
