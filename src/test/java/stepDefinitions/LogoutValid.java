package stepDefinitions;
import com.webAutomationB4.actions.LogoutPageActions;

//import
import com.webAutomationB4.Settings.SettingClass;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutValid {
    LogoutPageActions objLogout = new LogoutPageActions();
    
    @Given("User already access Zaidan URL {string} and logged in as {string} with {string} password")
    public void login(String link, String username, String password){        
        SettingClass.setUpDriver();
        SettingClass.openPage(link);
        objLogout.loginStep(username, password);
    }

    @When("User click logout button and click confirm button")
    public void logout(){
        objLogout.logoutStep();
    }

    @Then("User should be see logo, title {string}, and username password input field")
    public void identity(String expectedTitle){
        WebElement logo = objLogout.getLogo();
        Assertions.assertTrue(logo.isDisplayed());
        Assertions.assertEquals(objLogout.getLoginTitle(), expectedTitle);
        Assertions.assertTrue(objLogout.getUsernameField().isDisplayed());
        Assertions.assertTrue(objLogout.getPasswordField().isDisplayed());
    }

}
