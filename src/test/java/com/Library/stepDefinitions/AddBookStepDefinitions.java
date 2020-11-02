package com.Library.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddBookStepDefinitions {

    WebDriver driver;




    @When("User clicks Books module")
    public void userClicksBooksModule() {
    }

    @Then("User should be navigated to Book Management")
    public void userShouldBeNavigatedToBookManagement() {
    }

    @When("User clicks Add book button")
    public void userClicksAddBookButton() {
    }

    @And("User enters {string}, “<ISBN>”, “<Year>”, “<Author>”, “<Description>” tables")
    public void userEntersISBNYearAuthorDescriptionTables(String arg0) {
    }

    @And("choosing {string} from “<Book Category>”")
    public void choosingFromBookCategory(String arg0) {
    }

    @And("User clicks on Save changes button")
    public void userClicksOnSaveChangesButton() {
    }

    @Then("User should able see the confirmation message The book has been created.")
    public void userShouldAbleSeeTheConfirmationMessageTheBookHasBeenCreated() {
    }
}
