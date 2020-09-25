package pages;

import commonHelpers.Common;
import org.openqa.selenium.By;

public class HomePage extends Common {

    private By dogCategory = By.id("mtd_300");

    public void openHomePage (){
        driver.get("https://www.ss.lv");
    }

    public void findDogs (){
        driver.findElement(dogCategory).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
