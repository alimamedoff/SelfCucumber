package com.Library.pages;

import com.Library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibrarianDashboardPage {

    public LibrarianDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li[@class='nav-item'])[1]")
    public WebElement dashboardBtn;

    @FindBy(xpath = "(//li[@class='nav-item'])[2]")
    public WebElement UsersBtn;

    @FindBy(xpath = "(//li[@class='nav-item'])[3]")
    public WebElement BooksBtn;

    @FindBy(className = "nav-link dropdown-toggle")
    public WebElement accountBtn;

    @FindBy(partialLinkText = "Log Out")
    public WebElement logoutBtn;











    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;



}
