package com.Library.pages;

import com.Library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LibrarianBookManagementPage extends BasePage {
   public LibrarianBookManagementPage(){
       PageFactory.initElements(Driver.getDriver(), this);
   }


   @FindBy(tagName = "h3")
   public WebElement header;

   @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm add_book_btn']")
    public WebElement addBookBtn;

   @FindBy(className = "form-control input-sm input-small input-inline")
    public WebElement searchBox;

   @FindBy(xpath = "//select[@id='book_categories']")
    public List<WebElement> bookCategoriesDropdown;

   @FindBy(xpath = "//select[@name='tbl_books_length']")
    public WebElement showRecordsDropdown;









}
