package videos.youtube.reddit;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class RedditTest {

    @Managed(driver = "chrome", options = "-start-maximized --disable-notificacions --lang=en-US")
    WebDriver driver;

    @Steps
    RedditActions redditActions;

    @Test
    @DisplayName("Verify trending today title in Reddit")
    void testTitleOfTrendingToday(){
        redditActions.openHomePage();
        Assertions.assertThat(redditActions.getTrendingTitle())
                .isEqualTo("Trending today");
    }

}
