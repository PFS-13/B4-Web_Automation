package com.webAutomationB4.Settings;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxBinary;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SettingClass {
    private static SettingClass settingClass;
    private static WebDriver driver;
    public final static int TIMEOUT = 30;
    private SettingClass() {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();

        driver = new FirefoxDriver(options); //Creating an object of FirefoxDriver


        driver.manage().window().maximize(); //maximize window
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));

    }

    public static void openPage(String url) {
        driver.get(url);
    }

    //get current state driver
    public static WebDriver getDriver() {
        return driver;
    }

    //first time run driver
    public static void setUpDriver() {
        if (settingClass==null) {
            settingClass = new SettingClass();
        }
    }

    //closed driver after test case finish execution
    public static void tearDown() {
        if(driver!=null) {
            driver.close();
            driver.quit();
        }

        settingClass = null;
    }


}
