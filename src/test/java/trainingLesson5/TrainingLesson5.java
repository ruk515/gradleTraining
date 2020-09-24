package trainingLesson5;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainingLesson5 {


    @Test
    public void openWebPage() {
        String driverPath = "/Users/uldisjekabsons/IdeaProjects/GradleTraining/src/test/resources/";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.ss.lv/lv");
        driver.findElement(By.id("mtd_300")).click();
        driver.findElement(By.id("f_o_1276_min")).sendKeys("1");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();


    }

}
