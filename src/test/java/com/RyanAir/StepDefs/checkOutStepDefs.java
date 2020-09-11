package com.RyanAir.StepDefs;

import com.RyanAir.Pages.FlightPage;
import com.RyanAir.Pages.HomePage;
import com.RyanAir.Utilities.ConfigurationReader;
import com.RyanAir.Utilities.Driver;
import com.RyanAir.Utilities.ShortCuts;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class checkOutStepDefs {

    HomePage hp=new HomePage();
    FlightPage fp=new FlightPage();
    Actions actions=new Actions(Driver.get());


    @Given("user should navigated to a page that has a {string} title")
    public void user_should_navigated_to_a_page_that_has_a_title(String expectedTitle) {
        String actualTitle= ShortCuts.GetTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Given("user should be able to Login")
    public void user_should_be_able_to_Login() {

        hp.headerMenu("Log in").click();
        ShortCuts.waitTillVisibility(hp.email);
        hp.email.sendKeys(ConfigurationReader.get("email"));
        hp.password.sendKeys(ConfigurationReader.get("password")+ Keys.ENTER);
    }

    @Then("user should be able to select departure city {string} and airport {string}")
    public void user_should_be_able_to_select_departure_city_and_airport(String City, String airportName) {
        fp.oneWay.click();
        ShortCuts.staticWait(1);
        actions.moveToElement(fp.from).doubleClick().perform();
        fp.from.sendKeys(City);
        fp.pickAirportName(airportName);
    }

    @Then("user should be able to select destination city {string} and airport {string}")
    public void user_should_be_able_to_select_destination_city_and_airport(String City, String airportName) {
     fp.to.sendKeys(City);
     fp.pickAirportName(airportName);
    }

    @When("user select the flight date {string}")
    public void user_select_the_flight_date(String date) {
        fp.departureDate(date);
    }

    @Then("user can select type of passangers {string},{string},{string},{string} and click the seach button")
    public void user_can_select_type_of_passangers_and_click_the_seach_button(String Adults, String Teens, String Children, String Infant) {

        int adultNum=Integer.parseInt(Adults.replaceAll("[\\D]", ""));
        int teensNum=Integer.parseInt(Teens.replaceAll("[\\D]", ""));
        int childrenNum=Integer.parseInt(Children.replaceAll("[\\D]", ""));
        int infantNum=Integer.parseInt(Infant.replaceAll("[\\D]", ""));


        for(int i=0; i<adultNum;i++){
            fp.Adults.click();
        }
        for(int i=0; i<teensNum;i++){
            fp.Teens.click();
        }
        for(int i=0; i<childrenNum;i++){
            fp.Children.click();
        }
        for(int i=0; i<infantNum;i++){
            fp.Infant.click();
        }

          fp.searchButton.click();

    }
}
