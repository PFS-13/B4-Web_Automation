package stepDefinitions;
import com.webAutomationB4.actions.HomePageActions;
import com.webAutomationB4.actions.LoginPageActions;
import org.junit.Assert;
import org.openqa.selenium.By;

//import
import com.webAutomationB4.Settings.SettingClass;
import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Arrays;
import java.util.List;

public class LoginPage {
    LoginPageActions objLogin = new LoginPageActions();
    HomePageActions objHomePage = new HomePageActions();

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

    @Then("User should be see bendahara dashboard page")
    public void user_is_navigated_to_dashboard() {
        Assert.assertTrue(objHomePage.getHomePageText().contains("Dasbor - Bendahara"));
    }

    @And("User should be see navbar items")
    public void user_should_see_all_sidebar_items() {
        List<String> expectedItems = Arrays.asList(
                "Dasbor",
                "Tagihan Siswa",
                "Transaksi Penerimaan Dana",
                "Pengaturan Notifikasi",
                "Status Pembayaran",
                "Rekapitulasi",
                "Progres Transaksi Penerimaan Dana"
        );
        List<String> actualItems = objHomePage.getSidebarItems();
        Assert.assertEquals(actualItems, expectedItems);
    }

    @Then("User should be see error message {string}")
    public void get(String expectedName) {
        String actualName = objLogin.getErrorMessage();
        Assertions.assertEquals(actualName, expectedName);
    }
}
