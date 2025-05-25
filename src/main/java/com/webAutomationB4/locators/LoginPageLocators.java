package com.webAutomationB4.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
    @FindBy(xpath = "//*[@id=\":r8:-form-item\"]")
    public WebElement userName;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/form/div[2]/div/input")
    public WebElement password;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/form/button")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div")
    public  WebElement errorMessage;
}