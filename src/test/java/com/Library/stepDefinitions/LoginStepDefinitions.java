package com.Library.stepDefinitions;

import com.Library.pages.LoginPage;
import com.Library.utils.ConfigurationReader;
import com.Library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("dashboard should be displayed")
    public void dashboardShouldBeDisplayed() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Library";
    }

    @When("user login as a librarian")
    public void userLoginAsALibrarian() {
        loginPage.login("librarian");
    }

    @When("user login as a studentOne")
    public void userLoginAsAStudentOne() {
        loginPage.login("student21");
    }

    @When("user login as a studentTwo")
    public void userLoginAsAStudentTwo() {
        loginPage.login("student22");
    }

    @When("user logs in as a {string}")
    public void userLogsInAsA(String student) {
        loginPage.login("student21");
    }
    @When("user finds desired {string}")
    public void userFindsDesired(String book) {
        loginPage.searchBox.sendKeys("The Idiot" + Keys.ENTER);
    }
}
