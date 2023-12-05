package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Completed extends Utility {
    By verifyTextThankYou = By.xpath("//h1[normalize-space()='Thank you']");
    By verifyTextYourOrderHasBeenSuccessfullyProcessed = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueButton3 = By.xpath("//button[normalize-space()='Continue']");



    public String getVerifyTextThankYou(){
        return getTextFromElement(verifyTextThankYou);
    }
    public String getVerifyYourOrderHasBeenSuccessfullyProcessed(){
        return getTextFromElement(verifyTextYourOrderHasBeenSuccessfullyProcessed);
    }
 public void clickOnContinueButton3(){
        mouseHoverToElementAndClick(continueButton3);
 }


}
