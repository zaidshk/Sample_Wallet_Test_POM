package tests;

import utils.DriverUtils;
import io.appium.java_client.AppiumDriver;

public class BaseTest {

    protected AppiumDriver driver;

//Initializing the driver to use it across all the test scripts
    // This can be useful for Parallel Script execution in future
    public void setUp() {
        DriverUtils.initializeDriver();
        driver = DriverUtils.getDriver();
    }

}
