package com.RyanAir.StepDefs;

import com.RyanAir.Pages.*;
import com.RyanAir.Utilities.ConfigurationReader;
import com.RyanAir.Utilities.Driver;
import com.RyanAir.Utilities.ShortCuts;
import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class checkOutStepDefs {

    HomePage hp=new HomePage();
    FlightPage fp=new FlightPage();
    Actions actions=new Actions(Driver.get());
    CheckOutPage cop=new CheckOutPage();
    Random rnd=new Random();
    WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
    LuggagePage lp=new LuggagePage();
    PaymentPage pp=new PaymentPage();
    Faker faker=new Faker();


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


        for(int i=0; i<adultNum-1;i++){
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

    @Given("user should select the ticket")
    public void user_should_select_the_ticket() {


        fp.cookie.click();
        ShortCuts.scrollCondition(fp.ticket);
        fp.ticket.click();
        ShortCuts.waitTillVisibility(cop.flightTypeValue);
        cop.flightTypeValue.click();

    }


    @When("user enter the informations {string} {string} {string} and click continue button")
    public void user_enter_the_informations_and_click_continue_button(String title, String firstName, String lastName) {

        ShortCuts.waitTillVisibility(cop.continueButton);
        cop.title(title);
        cop.fullName(firstName,lastName);
        cop.continueButton.click();
    }

    @Then("user should select the seat preferance {string}")
    public void user_should_select_the_seat_preferance(String seatPreferance) {

        switch (seatPreferance){
            case "Extra Legroom":
               int seatNumVIP= rnd.nextInt(27);
               for (int i=0; i<5; i++){

                   try {
                       cop.seatList.get(seatNumVIP).click();
                   }catch (Exception e){
                       cop.seatList.get(seatNumVIP+1).click();
                   }

               }

                break;

            case "Standard":
                int seatNumStandard=(int)(Math.random() * (181 - 28 + 1) + 181);
                for (int i=0; i<5; i++){

                    try {
                        cop.seatList.get(seatNumStandard).click();
                    }catch (Exception e){
                        cop.seatList.get(seatNumStandard+1).click();
                    }

                }

                break;

            default:
                throw new  ElementNotInteractableException("The number that generated is not exist in this plane");

        }

        cop.continueButton.click();
        cop.noThanksButton.click();
    }

    @Then("user should select the small bag")
    public void user_should_select_the_small_bag() {
        lp.smallBag.click();
        ShortCuts.scroll();
        ShortCuts.scroll();
        ShortCuts.scroll();
        lp.continueButton.click();
        ShortCuts.scroll();
        lp.continueButton.click();
        ShortCuts.staticWait(2);
    }

    @Given("user should be able to click basket")
    public void user_should_be_able_to_click_basket() {
        //wait.until(ExpectedConditions.elementToBeClickable(hp.chartButton));
        hp.chartButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(lp.checkOut));
        lp.checkOut.click();
    }

    @Then("user should be able to select country code and type phone number {string}")
    public void user_should_be_able_to_select_country_code_and_type_phone_number(String phoneNumber) {
          pp.countryCodeButton.click();
          actions.moveToElement(pp.firstInCountryCode).perform();
          ShortCuts.scrollCondition(pp.spainCode);
          pp.spainCode.click();
          pp.phoneNumberBox.click();
          pp.phoneNumberBox.sendKeys(phoneNumber);

    }

    @Then("user should insert credit card informations")
    public void user_should_insert_credit_card_informations() {
        pp.noInsurance.click();
        ShortCuts.scrollCondition(pp.cardNumber);
        ShortCuts.waitTillVisibility(pp.cardNumber);
        String cardName=faker.finance().creditCard(CreditCardType.VISA);
        cardName.replaceAll("-","");
        pp.cardNumber.sendKeys("4366 8220 5304 3441");
        pp.ccv.sendKeys("155");
        pp.cardHolderName.sendKeys("Marge Wolff");
        pp.adressLine.sendKeys(faker.address().streetAddress());
        pp.cityName.sendKeys(faker.address().cityName());
        pp.country.sendKeys("Spain"+Keys.ENTER);
        pp.zipCode.sendKeys(faker.address().zipCode());
        pp.yearDropDown.click();
        pp.setYearDropDown(2026);
        pp.monthDropDown.click();
        pp.setMonthDropDown("June");
        ShortCuts.scroll();
        pp.termsCondition.click();
        pp.currencyDropdown.click();
        pp.setCurrencyDropdown("EUR");
        pp.payNowButton.click();
    }

    @Then("user should get error message {string}")
    public void user_should_get_error_message(String expectedErrorMessage) {

    }

}
