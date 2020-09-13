package com.RyanAir.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends HomePage {

    @FindBy(xpath = "(//*[contains(text(),'+353')])[1]/../..")
    public WebElement countryCodeButton;

    @FindBy(xpath = "(//*[contains(text(),'+93')])")
    public WebElement firstInCountryCode;

    @FindBy(xpath = "(//*[contains(text(), '+34')])[2]")
    public WebElement spainCode;

    @FindBy(xpath = "//*[text()='Phone number *']/../div")
    public WebElement phoneNumberBox;
}
