package com.Library.pages;

import com.Library.utils.ConfigurationReader;
import com.Library.utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    public WebElement username;
    @FindBy(id = "inputPassword")
    public WebElement password;
    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;



    public void login(){
        String usernameValue = ConfigurationReader.getProperty("username");
        String passwordValue = ConfigurationReader.getProperty("password");
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);

    }

    public void login(String role) {
        String usernameValue = "";
        String passwordValue = "";

        if (role.equalsIgnoreCase("librarian")) {
            usernameValue = ConfigurationReader.getProperty("usernameLibrarian");
            passwordValue = ConfigurationReader.getProperty("passwordLibrarian");
        } else if (role.equalsIgnoreCase("student21")) {
            usernameValue = ConfigurationReader.getProperty("usernameStudent21");
            passwordValue = ConfigurationReader.getProperty("passwordStudent21");
        } else {
            usernameValue = ConfigurationReader.getProperty("usernameStudent22");
            passwordValue = ConfigurationReader.getProperty("passwordStudent22");
        }

        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);

    }
}
