package homeWorkLesson5;

import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class BonusTask {
    /**
     * 1. Open https://220.lv
     * 2. Click on menu item “Auto preces”
     * 3. Click on category “Riepas”
     * 4. Verify page title is “PLAŠĀKAIS AUTO PREČU KLĀSTS ! IENĀC INTERNETA VEIKALĀ 220.LV ! | 220.lv”
     * 5. Click on “Vasaras riepas”
     * 6. Search tires by following input “Riepas platums 215 Profils 60 Ražotājs Bridgestone”
     * 7. Add to cart
     */
    @Test
    public void BonusTask() throws InterruptedException {
        String driverPath = "/Users/uldisjekabsons/IdeaProjects/GradleTraining/src/test/resources/";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.220.lv");

        driver.findElement(By.xpath("//li[@id='department-4579']")).click();
        driver.findElement(By.xpath("//img[@alt='Riepas']")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Riepas internetā - Vasaras, Ziemas, Vissezonas riepas | 220.lv";
        SoftAssertions compareTitle = new SoftAssertions();
        compareTitle.assertThat(expectedTitle).isEqualTo(actualTitle);
        compareTitle.assertAll();

        driver.findElement(By.xpath("//img[@alt='Vasaras riepas']")).click();
        driver.findElement(By.xpath("//a[@id='brand-filter-bridgestone-7314271']")).click();

        driver.findElement(By.xpath("//*[@id=\"filter1511\"]/div[2]")).click();
        driver.findElement(By.xpath("//li[@data-value='7130467']")).click();

        driver.findElement(By.xpath("//div[@widget-id='filter1502']")).click();
        driver.findElement(By.xpath("//option[@value='7130554']")).click();



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}

