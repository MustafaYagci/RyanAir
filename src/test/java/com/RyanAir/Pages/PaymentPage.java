package com.RyanAir.Pages;

import com.RyanAir.Utilities.Driver;
import com.RyanAir.Utilities.ShortCuts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends HomePage {

    @FindBy(xpath = "//*[@id='insurance-opt-out']/../div[1]")
    public WebElement noInsurance;

    @FindBy(xpath = "(//*[contains(text(),'+353')])[1]/../..")
    public WebElement countryCodeButton;

    @FindBy(xpath = "(//*[contains(text(),'+93')])")
    public WebElement firstInCountryCode;

    @FindBy(xpath = "(//*[contains(text(), '+34')])[2]")
    public WebElement spainCode;

    @FindBy(xpath = "//*[text()='Phone number *']/../div/input")
    public WebElement phoneNumberBox;

    @FindBy(xpath = "//*[text()='Card number *']/../div/input")
    public WebElement cardNumber;

    @FindBy(xpath = "//*[text()='Security code *']/../div/input")
    public WebElement ccv;

    @FindBy(xpath = "//*[text()='Cardholder name *']/../div/input")
    public WebElement cardHolderName;

    @FindBy(xpath = "//*[text()='Address line 1 *']/../div/input")
    public WebElement adressLine;

    @FindBy(xpath = "//*[text()='City *']/../div/input")
    public WebElement cityName;

    @FindBy(xpath = "//*[contains(text(),'Country *')]/../../input")
    public WebElement country;

    @FindBy(xpath = "//*[text()='Postcode/ZIP code *']/..//input")
    public WebElement zipCode;

    @FindBy(xpath = "//*[contains(text(),'Year')]/..")
    public WebElement yearDropDown;

    @FindBy(xpath = "//*[text()='Month']/..")
    public WebElement monthDropDown;

    @FindBy(xpath = "//*[@id='termsAndConditions']/../div[1]")
    public WebElement termsCondition;

    @FindBy(xpath = "(//*[contains(text(),'Currency')][1]/..//button)[1]")
    public WebElement currencyDropdown;

    @FindBy(xpath = "//*[contains(text(),' Pay now ')]")
    public WebElement payNowButton;

    public void setYearDropDown(int year){
        if (year>2020 && year<2030){
            String yearString = year+"";
            WebElement yearElement=Driver.get().findElement(By.xpath("//*[text()='"+yearString+"']"));
            ShortCuts.scrollCondition(yearElement);
            yearElement.click();
        }
        else {
            throw new IllegalArgumentException("The number that you enter is not exist select between 2020 to 2030");
        }
    }

    public void setMonthDropDown(String month){
        WebElement monthElement=Driver.get().findElement(By.xpath("//*[text()='"+month+"']/.."));
        ShortCuts.scrollCondition(monthElement);
        monthElement.click();
    }

    public void setCurrencyDropdown(String currencyType){
        Driver.get().findElement(By.xpath("//*[contains(text(),'"+currencyType+"')]")).click();
    }


}
