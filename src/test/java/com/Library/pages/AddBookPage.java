package com.Library.pages;

import com.Library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBookPage {
    public AddBookPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='name']")
    public WebElement bookNameBox;

    @FindBy(xpath = "//input[@name='isbn']")
    public WebElement ISNB;

    @FindBy(xpath = "//input[@name='year']")
    public WebElement year;

    @FindBy(xpath = "//input[@name='author']")
    public WebElement author;

    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement description;

    @FindBy(xpath = "//select[@id='book_group_id']")
    public WebElement bookCategoryDropdown;

    @FindBy(xpath = "//button[@class='btn default']")
    public WebElement closeBtn;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveChanges;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement xBtn;




}
