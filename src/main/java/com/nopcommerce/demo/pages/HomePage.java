package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage  extends Utility {


    private Object By;
    By computers = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktops =  By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
By verifyTextWelcomeToOurStore = By.xpath("//h2[normalize-space()='Welcome to our store']");

    public void clickOnComputers(){
        mouseHoverToElement(computers);
    }
    public void clickOnDesktops(){
        mouseHoverToElementAndClick(desktops);
    }
    public String getVerifyTextWelcomeToOurStore(){
        return getTextFromElement(verifyTextWelcomeToOurStore);
    }




