package pages;

import commonHelpers.Common;
import org.openqa.selenium.By;
import org.assertj.core.api.SoftAssertions;

public class JanisRozeWebPage extends Common {

    private String correctLogInMail = "jekabsons.u@gmail.com";
    private String correctPassword = "battyboy";

    public void openJanisRozeWebPage() {
        driver.get("https://www.janisroze.lv/lv/");
    }

    public void enterCorrectCredentials() {
        driver.get("https://www.janisroze.lv/lv_p/customer/account/login/");
        driver.findElement(By.name("login[username]")).sendKeys(correctLogInMail);
        driver.findElement(By.name("login[password]")).sendKeys(correctPassword);

    }

    public void pressLogInButton() {
        driver.findElement(By.id("send2")).click();
    }

    public void verifyLogInSuccess() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.janisroze.lv/lv_p/customer/account/index/";
        SoftAssertions confirmLogIn = new SoftAssertions();
        confirmLogIn.assertThat(expectedUrl).isEqualTo(actualUrl);

    }
}
