package stepDefinitions;
import com.webAutomationB4.actions.LoginPageActions;
import org.openqa.selenium.By;

//import
import com.webAutomationB4.Settings.SettingClass;
import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
    LoginPageActions objLogin = new LoginPageActions();

    @Given("User already access Zaidan URL {string}")
    public void navigateToWebApp(String url) {
        //navigate to url website
        SettingClass.setUpDriver();
        SettingClass.openPage(url);
    }

    @When("User enters username as {string} and password {string}")
    public void loginProcess(String username, String password) {
        objLogin.loginStep(username, password);
    }

    @Then("User should be see error message {string}")
    public void get(String expectedName) {
        String actualName = objLogin.getErrorMessage();
        Assertions.assertEquals(actualName, expectedName);
    }


}
