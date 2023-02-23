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
}
