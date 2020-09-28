package pages;

import commonHelpers.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SsLvHomePage extends Common {

    private By dogCategory = By.id("mtd_300");
    private By carCategory = By.id("mtd_97");
    private By minimalPriceField = By.id("f_o_8_min");
    private By maxPriceField = By.id("f_o_8_max");
    private By minimalCarYearField = By.id("f_o_18_min");
    private By maxEngineSizeField = By.id("f_o_15_max");
    private By carColorField = By.id("f_o_17");
    private By searchButton = By.xpath("//input[@type='submit']");

    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void selectCarColor(String carColorCode) {
        Select selectCarColor = new Select(driver.findElement(carColorField));
        selectCarColor.selectByValue(carColorCode);
    }

    public void selectMaxEngineSize(String maxEngineSize) {
        Select engineSize = new Select(driver.findElement(maxEngineSizeField));
        engineSize.selectByVisibleText(maxEngineSize);
    }


    public void selectMinimalCarYear(String minimalCarYearValue) {
        Select select = new Select(driver.findElement(minimalCarYearField));
        select.selectByVisibleText(minimalCarYearValue);
    }

    public void openSsLv() {
        driver.get("https://www.ss.lv");
    }

    public void findDogs() {
        driver.findElement(dogCategory).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openCars() {
        driver.findElement(carCategory).click();
    }

    public void enterMinimalCarPrice(String minimalPrice) {
        driver.findElement(minimalPriceField).sendKeys(minimalPrice);
    }

    public void enterMaxCarPrice(String maxPrice) {
        driver.findElement(maxPriceField).sendKeys(maxPrice);
    }
}
