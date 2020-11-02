package com.Library.pages;

import com.Library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBookPage {
    public AddBookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "inputEmail")
    WebElement username;
    @FindBy(id = "inputPassword")
    WebElement password;

}
