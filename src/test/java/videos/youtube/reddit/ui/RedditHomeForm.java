package videos.youtube.reddit.ui;

public class RedditHomeForm {

    public static final String TRENDING_TITLE = "//div[@id = 'TrendingPostsContainer']//child::div[text() = 'Trending today']";
    public static final String LOGIN_BUTTON = "//button//following-sibling::a[text() = 'Log In']";
    public static final String USERNAME_FIELD = "//input[@id = 'loginUsername']";
    public static final String PASSWORD_FIELD = "//input[@id ='loginPassword']";
    public static final String SUBMIT_LOGIN_BUTTON = "//form[@action = '/login']//button[@type = 'submit']";
    public static final String USERNAME_HEADER = "//div[@id= 'email-verification-tooltip-id']//span//span[text() = '%s']";
    public static final String LOGIN_IFRAME = "//iframe[@class = '_25r3t_lrPF3M6zD2YkWvZU']";
    public static final String INPUT_SEARCH_REDDIT = "//input[@id = 'header-search-bar']";
    public static final String SEARCH_REDDIT_BUTTON = "//button[@data-testid= 'search-trigger-item']";
    public static final String COMMUNITIES_TAB = "//a[@data-testid= 'tab_communities']";
    public static final String SUBREDDIT_IN_COMMUNITIES_LIST = "//a[@data-testid='subreddit-link']//h6[text() = '%s']";
    public static final String CREATE_POST_INPUT = "//input[@name = 'createPost']";
    public static final String POST_TITLE = "//textarea[@placeholder = 'Title']";
    public static final String POST_TEXT = "//div[@role = 'textbox']";
    public static final String SUBMIT_POST_BUTTON = "//button[text() = 'Post' and @role = 'button']";
    public static final String POST_PUBLISHED_CONTAINER = "//div[@data-testid = 'post-container']";
    public static final String DIALOG_MODAL_CLOSE = "//div[@role = 'dialog']//i";

}
