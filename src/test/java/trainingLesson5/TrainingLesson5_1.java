package trainingLesson5;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * •Go to https://www.ss.com/lv/•
 * Open cars
 * •Enter price 6000  -10000
 * •year from 2001•
 * engine max 3.0
 * •colour–Balta•Click submit
 */

public class TrainingLesson5_1 {
    @Test
    public void findCar() {
        String driverPath = "/Users/uldisjekabsons/IdeaProjects/GradleTraining/src/test/resources/";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.ss.lv/lv");
        driver.findElement(By.id("mtd_97")).click();

        driver.findElement(By.id("f_o_8_min")).sendKeys("6000");
        driver.findElement(By.id("f_o_8_max")).sendKeys("10000");
        Select carYear = new Select(driver.findElement(By.id("f_o_18_min")));
        carYear.selectByVisibleText("2001");

        Select engineSize = new Select(driver.findElement(By.id("f_o_15_max")));
        engineSize.selectByVisibleText("3.0");

        Select carColor = new Select(driver.findElement(By.id("f_o_17")));
        carColor.selectByValue("6318");

        driver.findElement(By.xpath("//input[@class='b s12']")).click();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
