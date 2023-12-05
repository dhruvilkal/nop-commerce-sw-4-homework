package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ConfirmOrder extends Utility {
    By verifyTextPaymentMethodCreditCard = By.xpath("//span[normalize-space()='Payment Method:']");
    By verifyTextShippingMethodNextDayAir = By.xpath("//span[normalize-space()='Shipping Method:']");
By verifyTextTotalPrice = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
By confirm = By.xpath("//button[normalize-space()='Confirm']");



    public String getVerifyTextPaymentMethodCreditCard(){
        return getTextFromElement(verifyTextPaymentMethodCreditCard);
    }
    public String getVerifyTextShippingMethodNextDayAir(){
        return getTextFromElement(verifyTextShippingMethodNextDayAir);
    }
    public String getVerifyTextTotalPrice(){
        return getTextFromElement(verifyTextTotalPrice);
    }
    public void clickOnConfirm(){
        mouseHoverToElementAndClick(confirm);
    }

}
