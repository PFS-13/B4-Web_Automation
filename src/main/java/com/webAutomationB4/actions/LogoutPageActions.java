package com.webAutomationB4.actions;
import org.openqa.selenium.support.PageFactory;
import com.webAutomationB4.locators.LogoutPageLocators;
import com.webAutomationB4.Settings.SettingClass;

public class LogoutPageActions {
    LogoutPageLocators logoutPage = null;
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
        logoutPage.passwordField.sendKeys(username);
        logoutPage.loginButton.click();
    }

    public String getLoginTitle() {
        return logoutPage.title.getText();

}
