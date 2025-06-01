package com.webAutomationB4.locators;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPageLocators {
    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/form/button")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/div[2]/main/div/div[1]/div/div/div[2]/button")
    public WebElement logoutButton;

    @FindBy(xpath = "/html/body/div[4]/div[2]/button[2]")
    public WebElement confirmButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/img")
    public WebElement logo;

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/h1")
    public WebElement title;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/form/div[1]/input")
    public WebElement usernameField;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div/form/div[2]/div/input")
    public WebElement passwordField;
}
