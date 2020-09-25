package homeWorkLesson5;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * • Login with your credentials
 * • Press Login
 * •
 */

public class Email {
    @Test
    public void EmailLogin() {
        String driverPath = "/Users/uldisjekabsons/IdeaProjects/GradleTraining/src/test/resources/";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.inbox.lv/");
        WebElement login = driver.findElement(By.xpath("//input[@id='imapuser']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        WebElement signInButton = driver.findElement(By.xpath("//button[@id='btn_sign-in']"));

        login.sendKeys("uldiits");
        password.sendKeys("battyboy");
        signInButton.click();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
