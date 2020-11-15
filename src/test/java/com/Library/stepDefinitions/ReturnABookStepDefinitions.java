package com.Library.stepDefinitions;

import com.Library.pages.LibrarianBookManagementPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class ReturnABookStepDefinitions {
    LibrarianBookManagementPage librarianBookManagementPage = new LibrarianBookManagementPage();

    @Given("user logged in as a Student")
    public void userLoggedInAsAStudent() {

    }

    @When("user finds desired {string}")
    public void userFindsDesired(String book) {
        librarianBookManagementPage.searchBox.sendKeys("The Idiot" + Keys.ENTER);
    }

    @Then("once book is read user should be able to return it by clicking one {string} button")
    public void onceBookIsReadUserShouldBeAbleToReturnItByClickingOneButton(String arg0) {

    }
}
