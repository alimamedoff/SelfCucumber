package com.Library.stepDefinitions;


import com.Library.pages.AddBookPage;
import com.Library.pages.LibrarianBookManagementPage;
import com.Library.utils.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;


public class AddBookStepDefinitions {
    LibrarianBookManagementPage librarianBookManagementPage = new LibrarianBookManagementPage();
    AddBookPage addBookPage = new AddBookPage();
    Select select;
    Alert alert;

    @Then("User sees an Add Book box with Add Book title")
    public void userSeesAnAddBookBoxWithAddBookTitle() {

        String expectedTitle = "Add Book";
        BrowserUtils.wait(2);
        String actualTitle = addBookPage.AddBookTitle.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @When("User clicks {string} module")
    public void userClicksModule(String link) {
        switch (link.toLowerCase()){
            case "dashboard":
               librarianBookManagementPage.dashboardLink.click();
                break;
            case "users":
                librarianBookManagementPage.usersLink.click();
               break;
            case "books":
                librarianBookManagementPage.booksLink.click();
                break;
            case "account":
                librarianBookManagementPage.accountLink.click();
                break;
        }
    }

    @Then("User should be navigated to Book Management")
    public void userShouldBeNavigatedToBookManagement() {
        String expectedHeader = "Book Management";
        String actualHeader = librarianBookManagementPage.header.getText();

        System.out.println("actualHeader = " + actualHeader);

        Assert.assertEquals(expectedHeader,actualHeader);
        
    }

    @When("User clicks Add book button")
    public void userClicksAddBookButton() {
        librarianBookManagementPage.addBookBtn.click();
    }

    @And("User enters {string}, {string}, {string}, {string}, {string} tables")
    public void userEntersTables(String bookName, String ISNB, String year, String author, String description) {
        BrowserUtils.wait(10);
        addBookPage.bookNameBox.sendKeys(bookName);
        addBookPage.ISNB.sendKeys(ISNB);
        addBookPage.year.sendKeys(year);
        addBookPage.author.sendKeys(author);
        addBookPage.description.sendKeys(description);
    }

    @And("User chooses {string} from Book Category")
    public void userChoosesFromBookCategory(String category) {
        select = new Select(addBookPage.bookCategoryDropdown);
        select.selectByVisibleText(category);

        
    }

    @And("User clicks on Save changes button")
    public void userClicksOnSaveChangesButton() {

        addBookPage.saveChanges.click();

    }

    @Then("User should be able see the confirmation message The book has been created.")
    public void userShouldBeAbleSeeTheConfirmationMessageTheBookHasBeenCreated() {
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        //      alert = Driver.getDriver().switchTo().alert();
        //        String expectedConformationMessageText = "The book has been created";
        //        System.out.println("expectedConformationMessageText = " + expectedConformationMessageText);
        //
        //       // String actualConformationMessageText = alert.getText();
        //        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("div[@class='toast-message']"), expectedConformationMessageText));
        //        String actualConformationMessageText =  addBookPage.confirmationMessage.getText();
        //                System.out.println("actualConformationMessageText = " + actualConformationMessageText);


        
    }



}
