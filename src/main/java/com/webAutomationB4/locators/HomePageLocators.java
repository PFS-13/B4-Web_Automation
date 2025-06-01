package com.webAutomationB4.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
    @FindBy(xpath = "/html/body/div[2]/main/div/div[1]/div/div/div[1]/h1")
    public WebElement homePageUserName;

    @FindBy(xpath = "//ul[@data-sidebar='menu']/li/a/span")
    public List<WebElement> sidebarItems;
}
