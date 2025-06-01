package com.webAutomationB4.actions;
import org.openqa.selenium.support.PageFactory;
import com.webAutomationB4.locators.LoginPageLocators;
import com.webAutomationB4.Settings.SettingClass;

public class LoginPageActions {
    LoginPageLocators loginPage = null;
    public LoginPageActions() {
        this.loginPage = new LoginPageLocators();
        PageFactory.initElements(SettingClass.getDriver(),loginPage);
    }

    public void loginStep(String username, String password) {
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(password);
        loginPage.loginButton.click();
    }

    public String getLoginHeader() {
        return loginPage.loginHeader.getText();
    }

    public String getWelcomeHeader() {
        return loginPage.welcomeHeader.getText();
    }



    public String getErrorMessage() {
        return loginPage.errorMessage.getText();
    }

}
