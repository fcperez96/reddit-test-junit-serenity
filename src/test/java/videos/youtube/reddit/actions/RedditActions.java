package videos.youtube.reddit.actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

import static videos.youtube.reddit.ui.RedditHomeForm.*;

public class RedditActions extends UIInteractions {

    @Step("Open the reddit application")
    public void openHomePage() {
        openUrl("https://www.reddit.com/");
    }

    @Step("Get title of Reddit trending today")
    public String getTrendingTitle() {
        return $(TRENDING_TITLE).getText();
    }

    @Step("Click on Log in Button")
    public void clickOnLoginButton() {
        $(LOGIN_BUTTON).click();
    }

    @Step("Enter username to log in")
    public void enterUsername(String username) {
        getDriver().switchTo().frame((WebElement) $(LOGIN_IFRAME));
        $(USERNAME_FIELD).sendKeys(username);
    }

    @Step("Enter password to log in")
    public void enterPassword(String password) {
        $(PASSWORD_FIELD).sendKeys(password);
    }

    @Step("Click on submit log in button")
    public void clickOnSubmitButton() {
        $(SUBMIT_LOGIN_BUTTON).click();
    }

    @Step("Get username from header")
    public boolean isUserLoggedId(String username) {
        String usernameHeaderLocator = String.format(USERNAME_HEADER, username);
        return $(usernameHeaderLocator).isVisible();
    }

    @Step("Search for subreddit {0}")
    public void searchForSubreddit(String subredditName) {
        $(INPUT_SEARCH_REDDIT).waitUntilClickable().sendKeys(subredditName);
        $(SEARCH_REDDIT_BUTTON).waitUntilVisible().click();
        $(COMMUNITIES_TAB).click();
    }

    @Step("Click on subreddit {0}")
    public void clickOnSubreddit(String subredditName) {
        String subredditNameModify = "r/" + subredditName.toLowerCase();
        String subredditInCommunitiesListLocator = String.format(SUBREDDIT_IN_COMMUNITIES_LIST, subredditNameModify);
        $(subredditInCommunitiesListLocator).click();
    }

    @Step("Click on input to post")
    public void clickOnInputToPost() {
        $(CREATE_POST_INPUT).click();
    }

    @Step("Enter new post title")
    public void enterPostTitle(String postTitle) {
        $(POST_TITLE).sendKeys(postTitle);
    }

    @Step("Enter new post text")
    public void enterPostText(String postText) {
        $(POST_TEXT).sendKeys(postText);
    }

    @Step("Click on submit post button")
    public void clickOnSubmitPostButton() {
        $(SUBMIT_POST_BUTTON).click();
    }

    @Step("Get verification to post published")
    public boolean isPostPublished() {
        return $(POST_PUBLISHED_CONTAINER).isVisible();
    }

    @Step("Close dialog modal")
    public void closeDialogModal() {
        $(DIALOG_MODAL_CLOSE).click();
    }
}
