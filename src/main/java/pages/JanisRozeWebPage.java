package pages;

import commonHelpers.Common;
import org.openqa.selenium.By;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JanisRozeWebPage extends Common {

    private By logInButton = By.id("send2");
    private By username = By.name("login[username]");
    private By password = By.name("login[password]");
    private By failedLogInMessage = By.xpath("//li[@class='error-msg']");
    private By draugiemLogInButton = By.xpath("//*[@id=\"draugiem_login_button\"]/a");

    public void selectSocialMedia(){
        driver.findElement(draugiemLogInButton).click();
    }

    public void openJanisRozeWebPage() {
        driver.get("https://www.janisroze.lv/lv/");
    }

    public void enterCredentials(String logInMail, String logInPassword) {
        driver.get("https://www.janisroze.lv/lv_p/customer/account/login/");
        driver.findElement(username).sendKeys(logInMail);
        driver.findElement(password).sendKeys(logInPassword);

    }

    public void pressLogInButton() {
        driver.findElement(logInButton).click();
    }

    public void verifyLogInSuccess() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.janisroze.lv/lv_p/customer/account/index/";
        SoftAssertions confirmLogIn = new SoftAssertions();
        confirmLogIn.assertThat(expectedUrl).isEqualTo(actualUrl);

    }
    public void verifyFailedLogIn(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(failedLogInMessage)).isDisplayed();
    }
    public void openLogInPage(){
        driver.get("https://www.janisroze.lv/lv_p/customer/account/login/");
    }
}
