package videos.youtube.reddit.ui;

public class RedditHomeForm {

    public static final String TRENDING_TITLE = "//div[@id = 'TrendingPostsContainer']//child::div[text() = 'Trending today']";
    public static final String LOGIN_BUTTON = "//button//following-sibling::a[text() = 'Log In']";
    public static final String USERNAME_FIELD = "//input[@id = 'loginUsername']";
    public static final String PASSWORD_FIELD = "//input[@id ='loginPassword']";
    public static final String SUBMIT_LOGIN_BUTTON = "//form[@action = '/login']//button[@type = 'submit']";
    public static final String USERNAME_HEADER = "//div[@id= 'email-verification-tooltip-id']//span//span[text() = '%s']";
    public static final String LOGIN_IFRAME = "//iframe[@class = '_25r3t_lrPF3M6zD2YkWvZU']";

}
