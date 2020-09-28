package trainingLesson6;

import commonHelpers.Common;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.JanisRozeWebPage;

/**
 * • Open https://www.janisroze.lv
 * • Register account
 * • Create model where you get all Login data – username and password
 * • Write test 1 – Positive test case where user successfully logins to Web – assert that user has logged in to Portal
 * • Make login method generalized so it can be reused further in tests
 */

public class JRLogInTest extends Common {
    Common common = new Common();

    @Before
    public void setUp() {
        common.setupDriver();
    }


    @Test
    public void successfulLogIn() {
        JanisRozeWebPage page = new JanisRozeWebPage();

        page.openJanisRozeWebPage();
        page.enterCredentials("**********", "**********");
        page.pressLogInButton();
        page.verifyLogInSuccess();


    }
    @Test
    public void failedLogIn (){
        JanisRozeWebPage page = new JanisRozeWebPage();
        page.openJanisRozeWebPage();
        page.enterCredentials("ihavenoemail@mail.com", "password");
        page.pressLogInButton();
        page.verifyFailedLogIn();
    }

    @Test
    public void logInFromSocialMedia(){
        JanisRozeWebPage page = new JanisRozeWebPage();
        page.openJanisRozeWebPage();
        page.openLogInPage();
        page.selectSocialMedia();



    }

    @After
    public void closeDriver() {
        common.killDriver();
    }
}

