package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverUtils {

    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

    //Desirecapabilities
    public static void initializeDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", System.getProperty("user.dir") + "/src/main/java/utils/v8.7.1_release.apk");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Pixel_6_API_30");
        capabilities.setCapability("automationName", "UiAutomator2");

        try {
            driver.set(new AppiumDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities));
        } catch (MalformedURLException e) {
            throw new RuntimeException("Appium server URL is invalid", e);
        }
    }

    public static AppiumDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
