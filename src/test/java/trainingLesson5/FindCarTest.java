package trainingLesson5;

import commonHelpers.Common;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.SsLvHomePage;

/**
 * •Go to https://www.ss.com/lv/•
 * Open cars
 * •Enter price 6000  -10000
 * •year from 2001
 * •engine max 3.0
 * •color–Balta
 * •Click submit
 */

public class FindCarTest extends Common {
    Common common = new Common();

    @Before
    public void setUp() {
        common.setupDriver();
    }

    @Test
    public void findCar() {

        SsLvHomePage page = new SsLvHomePage();

        page.openSsLv();
        page.openCars();
        page.enterMinimalCarPrice();
        page.enterMaxCarPrice();
        page.selectMinimalCarYear();
        page.selectMaxEngineSize();
        page.selectCarColor();
        page.clickSearchButton();


    }

    @After
    public void closeDriver() {
        common.killDriver();
    }
}