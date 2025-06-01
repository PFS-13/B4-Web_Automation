package stepDefinitions;
import com.webAutomationB4.actions.LoginPageActions;

//import
import com.webAutomationB4.Settings.SettingClass;
import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginInvalid {
    LoginPageActions objLogin = new LoginPageActions();

    @Given("User access Zaidan URL {string}")
    public void navigateToWebApp(String url) {
        SettingClass.setUpDriver();
        SettingClass.openPage(url);
    }
    @Then("User arrive at login page")
    public void checkLoginPage() {
        String expectedHeader = "Pengelolaan Dana Pendidikan Sekolah Zaidan Educare";
        String actualHeader = objLogin.getLoginHeader();
        String expectedWelcome = "Selamat Datang";
        String actualWelcome = objLogin.getWelcomeHeader();
        Assertions.assertEquals(expectedHeader,actualHeader);
        Assertions.assertEquals(expectedWelcome,actualWelcome);
    }

    @When("User enters username as {string} and password {string}")
    public void loginProcess(String username, String password) {
        objLogin.loginStep(username, password);
    }

    @Then("User should be see error message {string}")
    public void get(String expectedMessage) {
        String actualMessage = objLogin.getErrorMessage();
        Assertions.assertEquals(actualMessage, expectedMessage);
    }


}
