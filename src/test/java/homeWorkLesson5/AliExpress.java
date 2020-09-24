package homeWorkLesson5;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AliExpress {
    /**
     * • Go to https://www.aliexpress.com/ • In search write: tattoo
     * • Press search
     * • Set min price 10
     * • Set max price 20 • Press ok
     */

    @Test
    public void TattooSearch() {
        String driverPath = "/Users/uldisjekabsons/IdeaProjects/GradleTraining/src/test/resources/";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.aliexpress.com/");
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("pc_1455_24317_20200923")));
        driver.switchTo().frame("pc_1455_24317_20200923").findElement(By.xpath("//*[@id=\"6216442440\"]/div/div/img")).click();
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//input[@name='SearchText']")).sendKeys("tattoo");
        driver.findElement(By.xpath("//input[@class='search-button']")).click();

//        driver.navigate().refresh();
//        driver.findElement(By.xpath("//input[@placeholder='min']")).sendKeys("10");
//        driver.findElement(By.xpath("//input[@placeholder='max']")).sendKeys("20");



//        try {
//            Thread.sleep(15000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            driver.quit();
//        }
    }

}