package com.RyanAir.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/Features",
        glue = "com/RyanAir/StepDefs",
        dryRun = false,
        tags = "@checkOut"
)
public class runner {

//This line writen from InteliJ
// This line writen from GitHub application by itself.
        //Hello



}
