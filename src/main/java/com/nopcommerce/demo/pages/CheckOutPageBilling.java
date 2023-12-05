package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPageBilling extends Utility {
    By nextDayAir = By.xpath("//input[@id='shippingoption_1']");
By continueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
By creditCard = By.xpath("//input[@id='paymentmethod_1']");
By continueButton2 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");









    public  void clickOnNextDayAir(){
        mouseHoverToElementAndClick(nextDayAir);
    }
    public void clickOnContinueButton(){
        mouseHoverToElementAndClick(continueButton);
    }
    public void clickOnCreditCard(){
        mouseHoverToElementAndClick(creditCard);
    }
    public void clickOnContinueButton2(){
        mouseHoverToElementAndClick(continueButton2);
    }

}
