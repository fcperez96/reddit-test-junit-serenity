package videos.youtube.reddit;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import videos.youtube.reddit.actions.RedditActions;

@ExtendWith(SerenityJUnit5Extension.class)
class RedditTest {

    @Managed(driver = "chrome", options = "-start-maximized --disable-notifications --lang=en-US")
    WebDriver driver;

    @Steps
    RedditActions redditActions;

    @BeforeEach
    void openApplication() {redditActions.openHomePage();}

    @Test
    @DisplayName("Verify trending today title in Reddit")
    void testTitleOfTrending(){
        Assertions.assertThat(redditActions.getTrendingTitle())
                .isEqualTo("Trending today");
    }

    @Test
    @DisplayName("Log in to reddit")
    void testLogin(){
        String username = "serenity_test";
        redditActions.clickOnLoginButton();
        redditActions.enterUsername(username);
        redditActions.enterPassword("Qwerty1234");
        redditActions.clickOnSubmitButton();
        Assertions.assertThat(redditActions.isUserLoggedId(username))
                .isTrue();
    }

    @Test
    @DisplayName("Public post")
    void testPostIdSubreddit(){
        String subredditName = "Selenium";
        testLogin();
        redditActions.closeDialogModal();
        redditActions.searchForSubreddit(subredditName);
        redditActions.clickOnSubreddit(subredditName);
        redditActions.clickOnInputToPost();
        redditActions.enterPostTitle("My new post from test automation");
        redditActions.enterPostText("This is my new post to test automation");
        redditActions.clickOnSubmitPostButton();
        Assertions.assertThat(redditActions.isPostPublished())
                .isTrue();
    }

}
