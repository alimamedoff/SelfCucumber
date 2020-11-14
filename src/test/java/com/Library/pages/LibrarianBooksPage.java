package com.Library.pages;

import com.Library.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LibrarianBooksPage {
   public LibrarianBooksPage(){
       PageFactory.initElements(Driver.getDriver(), this);
   }


   @FindBy(className = "btn btn-lg btn-outline btn-primary btn-sm add_book_btn")
    public WebElement addBookBtn;

   @FindBy(className = "form-control input-sm input-small input-inline")
    public WebElement searchBox;

   @FindBy()
    public List<WebElement> bookCategories;









}
