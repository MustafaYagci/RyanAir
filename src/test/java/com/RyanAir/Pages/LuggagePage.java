package com.RyanAir.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LuggagePage extends HomePage {
    @FindBy(css = "[for='ry-radio-button--0']")
    public WebElement smallBag;

    @FindBy(xpath = "//*[contains(text(), 'Continue')]")
    public WebElement continueButton;

    @FindBy(xpath = "(//button[contains(text(),'Check')])[1]")
    public WebElement checkOut;


}
