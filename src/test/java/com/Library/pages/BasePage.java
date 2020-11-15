package com.Library.pages;

import com.Library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

public BasePage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

    @FindBy(xpath = "(//li[@class='nav-item'])[1]")
    public WebElement dashboardLink;

    @FindBy(xpath = "(//li[@class='nav-item'])[2]")
    public WebElement usersLink;

    @FindBy(xpath = "(//li[@class='nav-item'])[3]")
    public WebElement booksLink;

    @FindBy(className = "nav-link dropdown-toggle")
    public WebElement accountLink;

    @FindBy(partialLinkText = "Log Out")
    public WebElement logoutBtn;






}
