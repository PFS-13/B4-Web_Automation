package stepDefinitions;

import io.cucumber.java.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.webAutomationB4.Settings.SettingClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

/* Create the hook class that contains the Before and After hook to initialize the web browser and close the web browser.
 * I have added the code to take the screenshot of the failed scenario in @After Hook.
 */
public class Hooks {

    private static WebDriver driver;


    @BeforeClass
    public static void setup() {
        System.out.println("Ran the before");
    }

    @Before
    //hooks run before the first step of each scenario
    public static void setUp() {
        SettingClass.setUpDriver();
    }

    @After
    // hooks run after the last step of each scenario, even when the step result is failed, undefined, pending, or skipped.
    // The scenario parameter is optional. If you use it, you can inspect the status of the scenario.
    public static void tearDown(Scenario scenario) {

        //validate if scenario has failed
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) SettingClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        //SettingClass.tearDown();
    }


    @AfterClass
    public static void Closed() {
        SettingClass.tearDown();
    }

    @AfterAll
    public static void exit() {
        SettingClass.getDriver().close();
    }
}

