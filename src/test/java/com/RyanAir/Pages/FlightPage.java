package com.RyanAir.Pages;

import com.RyanAir.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightPage extends HomePage {

    @FindBy(css = "[placeholder='Departure']")
    public WebElement from;

    @FindBy(css = "[placeholder='Destination']")
    public WebElement to;

    @FindBy(xpath = "//label[text()='One way']")
    public WebElement oneWay;

    public  void pickAirportName(String airportName){
        Driver.get().findElement(By.xpath("//span[text()=' "+airportName+" ']")).click();
    }

    public void departureDate(String date){
        Driver.get().findElement(By.xpath("//div[@data-id='"+date+"']")).click();
    }

    @FindBy(xpath = "(//icon[@classlist='icon-24'])[6]/../../..")
    public WebElement Adults;

    @FindBy(xpath = "(//icon[@classlist='icon-24'])[8]/../../..")
    public WebElement Teens;

    @FindBy(xpath = "(//icon[@classlist='icon-24'])[10]/../../..")
    public WebElement Children;

    @FindBy(xpath = "(//icon[@classlist='icon-24'])[12]/../../..")
    public WebElement Infant;

    @FindBy(xpath = "//*[text()=' Search ']")
    public WebElement searchButton;


}
