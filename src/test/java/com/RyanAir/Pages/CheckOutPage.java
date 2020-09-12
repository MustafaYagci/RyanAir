package com.RyanAir.Pages;

import com.RyanAir.Utilities.Driver;
import com.RyanAir.Utilities.ShortCuts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckOutPage extends HomePage {

    @FindBy(xpath = "//*[text()=' Value ']/../.")
    public WebElement flightTypeValue;

    public void title (String gender){
        Driver.get().findElement(By.xpath("//button[@type='button']")).click();
        ShortCuts.staticWait(1);
        Driver.get().findElement(By.xpath("//div[text()='"+gender+"']")).click();
    }

    public void fullName(String firstName, String lastName){
     Driver.get().findElement(By.xpath("//input[@type='text'][1]")).sendKeys(firstName);
     Driver.get().findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(lastName);
    }

    @FindBy(xpath = "//*[text()=' Continue ']")
    public WebElement continueButton;

    @FindBy(xpath = "//div[@*='seatmap']//button")
    public List<WebElement> seatList;

    @FindBy(xpath = "//*[text()=' No, thanks ']")
    public WebElement noThanksButton;
}
