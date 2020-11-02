package com.Library.stepDefinitions;

import com.Library.pages.LoginPage;
import com.Library.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageStepDefinitions {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"menu_item\"]/li[1]/a/span[1]")
    WebElement dashboard;


    @Given("navigate to URL")
    public void navigate_to_url() throws InterruptedException {
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
        Thread.sleep(2000);
    }

    @When("I input username, password and click the Login button")
    public void i_input_username_password_and_click_the_login_button() {
        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }
    @Then("I should navigate to the Homepage")
    public void i_should_navigate_to_the_homepage() {

        String expected = "Dashboard";
        String actual = dashboard.getText();
        Assert.assertEquals("Title is not correct",expected,actual);
    }
}
