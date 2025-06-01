package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.webAutomationB4.Settings.SettingClass;

public class Hooks {

    @Before
    public void setUp() {
        SettingClass.setUpDriver();
    }

    @After
    public void tearDown() {
        SettingClass.tearDown();
    }
}