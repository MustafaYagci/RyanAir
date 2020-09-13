package com.RyanAir.Pages;

import com.RyanAir.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//*[@autocomplete='email'])[2]")
    public WebElement email;

    @FindBy(xpath = "(//*[@autocomplete='password'])")
    public WebElement password;

    public  WebElement headerMenu(String moduleName) {

        List<WebElement> header = Driver.get().findElements(By.xpath("//hp-header-menu-item/button"));
        int counter=0;
       label: for (int i=0; i<header.size(); i++){

            if (moduleName.equals(header.get(i).getText())){
                counter=i;
                break label;
            }
        }
        return header.get(counter);
    }

    @FindBy(xpath = "(//*[@iconid='glyphs/circle-tick'])[1]")
    public WebElement chartButton;
}
