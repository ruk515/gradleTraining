package commonHelpers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Common {

    public static ChromeDriver driver;

    public void setupDriver() {

        String driverPath = "/Users/uldisjekabsons/IdeaProjects/GradleTraining/src/test/resources/";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    public void killDriver() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
