package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {
By verifyTextShoppingCart = By.xpath("//h1[normalize-space()='Shopping cart']");


// click on QtyBox
    By clickQtyBox = By.xpath("//td[@class='quantity']//input");
    //clear box
    By clearQtyBox = By.xpath("//td[@class='quantity']//input");
    //send Text
    By addQtyInBox = By.xpath("//td[@class='quantity']//input");

    By updateShoppingCart = By.xpath("//button[@id='updatecart']");
    By totalAmount = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");

    By checkBox = By.xpath("//input[@id='termsofservice']");
By checkOut = By.xpath("//button[@id='checkout']");




    public String getVerifyTextShoppingCart(){
        return getTextFromElement(verifyTextShoppingCart);
    }

    public void clickOnQtyBox(){
        mouseHoverToElementAndClick(clickQtyBox);
    }

    public void clearQuantityBox(){
clearInput(clearQtyBox);
    }

    public void sendQtyInBox(String Quantity){
        sendTextToElement(addQtyInBox,Quantity);

    }
    public void clickOnUpdateShoppingCart(){
        mouseHoverToElementAndClick(updateShoppingCart);
    }
    public String getTotalText(){
        return getTextFromElement(totalAmount);

    }
    public void clickOnCheckBox(){
mouseHoverToElementAndClick(checkBox);
    }
    public void clickOnCheckOut(){
        mouseHoverToElementAndClick(checkOut);
    }
}
