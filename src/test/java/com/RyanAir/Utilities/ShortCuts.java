package com.RyanAir.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShortCuts {

    public static String GetTitle(){
        return Driver.get().getTitle();
    }

    public static String getText(WebElement element){
        return element.getText();
    }

    public static void staticWait(int timeInMileseconds){
        try{
            Thread.sleep(timeInMileseconds);
        }catch (Exception e){

        }
    }

    public static void waitTillClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.get(),15);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitTillVisibility (WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.get(),15);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void scroll(){
        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("window.scrollBy(0,250)");
    }

    public static void scrollCondition(WebElement element){
        WebDriverWait wait=new WebDriverWait(Driver.get(), 10);
        String name = element.getText();
        while (!wait.until(ExpectedConditions.textToBePresentInElement(element,name))){
            ShortCuts.scroll();
        }
    }



}
