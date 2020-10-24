package com.weborders.pages;

import com.weborders.utils.ConfigurationReader;
import com.weborders.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "ct100_MainContent_username")
    private WebElement usernameElement;

    @FindBy(id = "ct100_MainContent_password")
    private WebElement passwordElement;

    public void login(){
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");

        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password, Keys.ENTER);

    }

}
