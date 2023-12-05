package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutAsGuest extends Utility {
    By verifyTextWelcome = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By checkOutAsGuest = By.xpath("//button[normalize-space()='Checkout as Guest']");










    public String getVerifyTextWelcome(){
        return getTextFromElement(verifyTextWelcome);

    }
    public void clickOnCheckOutAsGuest(){
        mouseHoverToElementAndClick(checkOutAsGuest);

    }
}
