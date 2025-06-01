package com.webAutomationB4.actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import com.webAutomationB4.locators.LogoutPageLocators;
import com.webAutomationB4.locators.LoginPageLocators;
import com.webAutomationB4.Settings.SettingClass;

public class LogoutPageActions {
    LogoutPageLocators logoutPage = null;
    LoginPageLocators loginPage = null;

    public LogoutPageActions() {
        this.logoutPage = new LogoutPageLocators();
        PageFactory.initElements(SettingClass.getDriver(),logoutPage);
    }

    public void logoutStep() {
        logoutPage.logoutButton.click();
        logoutPage.confirmButton.click();
    }

    public void loginStep(String username, String password){
        logoutPage.usernameField.sendKeys(username);
        logoutPage.passwordField.sendKeys(password);
        logoutPage.loginButton.click();
    }

    public String getLoginTitle() {
        return logoutPage.title.getText();
    }

    public WebElement getLogo(){
        return logoutPage.logo;
    }

    public WebElement getUsernameField(){
        return logoutPage.usernameField;
    }

    public WebElement getPasswordField(){
        return logoutPage.usernameField;
    }
}
