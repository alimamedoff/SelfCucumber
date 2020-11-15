package com.Library.stepDefinitions;

import com.Library.pages.LibrarianBookManagementPage;
import com.Library.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class BooksTableStepDefinitions {
    LibrarianBookManagementPage librarianBookManagementPage = new LibrarianBookManagementPage();

    @Then("table should have following column names:")
    public void tableShouldHaveFollowingColumnNames(List<String> ExpectedColumnNames) {

        List<String> actualColumnNames = BrowserUtils.getElementsText(librarianBookManagementPage.tableHeaders);

        Assert.assertEquals(ExpectedColumnNames, actualColumnNames);


    }
}
