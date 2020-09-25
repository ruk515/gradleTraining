package trainingLesson5;

import commonHelpers.Common;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.HomePage;

public class FindDogTest extends Common {

    Common common = new Common();

    @Before
    public void setUp() {
        common.setupDriver();
    }

    @Test
    public void findDogsByAge() {

        HomePage page = new HomePage();
        page.openHomePage();
        page.findDogs();

    }

    @After
    public void closeDriver() {
        common.killDriver();

    }

}
