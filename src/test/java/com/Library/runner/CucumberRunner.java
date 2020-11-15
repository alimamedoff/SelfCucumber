package com.Library.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com/Library/stepDefinitions",
        dryRun = false,
        tags ="@wip",
       // publish = true,
        plugin = "html:target/cucumber-report.html"
)

public class CucumberRunner {
}
