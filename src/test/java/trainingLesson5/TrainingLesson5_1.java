package trainingLesson5;

import commonHelpers.Common;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

/**
 * •Go to https://www.ss.com/lv/•
 * Open cars
 * •Enter price 6000  -10000
 * •year from 2001•
 * engine max 3.0
 * •colour–Balta•Click submit
 */

public class TrainingLesson5_1 extends Common {
    @Test
    public void findCar() {

        setupDriver();

        driver.get("https://www.ss.lv");
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

        killDriver();
    }
}
