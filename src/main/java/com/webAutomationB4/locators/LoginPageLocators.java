package com.webAutomationB4.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
    @FindBy(name = "username")
    public WebElement userName;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/form/div[2]/div/input")
    public WebElement password;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/form/button")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/h1")
    public WebElement loginHeader;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div/h1")
    public WebElement welcomeHeader;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div/p")
    public WebElement welcomeMessage;



    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/div[2]/div")
    public  WebElement errorMessage;
}

