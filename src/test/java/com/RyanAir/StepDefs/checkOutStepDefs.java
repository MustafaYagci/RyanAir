package com.RyanAir.StepDefs;

import com.RyanAir.Pages.HomePage;
import com.RyanAir.Utilities.ConfigurationReader;
import com.RyanAir.Utilities.Driver;
import com.RyanAir.Utilities.ShortCuts;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class checkOutStepDefs {

    HomePage hp=new HomePage();


    @Given("user should navigated to a page that has a {string} title")
    public void user_should_navigated_to_a_page_that_has_a_title(String expectedTitle) {
        String actualTitle= ShortCuts.GetTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Given("user should be able to Login")
    public void user_should_be_able_to_Login() {
                  hp.headerMenu("Log in").click();
    }
}
