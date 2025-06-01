package com.webAutomationB4.Settings;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;


public class SettingClass {
    private static SettingClass settingClass;
    private static WebDriver driver;
    public final static int TIMEOUT = 30;
    private SettingClass() {
        WebDriverManager.edgedriver().setup();

        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);

        ((JavascriptExecutor) driver).executeScript(
                "Object.defineProperty(navigator, 'webdriver', {get: () => undefined})"
        );

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();

    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
        if (settingClass==null) {
            settingClass = new SettingClass();
        }
    }

    public static void tearDown() {
        if(driver!=null) {
            driver.quit();
        }
        settingClass = null;
    }


}
