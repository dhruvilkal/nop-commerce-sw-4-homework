package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {
    By processor = By.xpath("//select[@id='product_attribute_1']");
    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");
    By  ram = By.xpath("//select[@id='product_attribute_2']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    By hdd = By.xpath("//input[@id='product_attribute_3_7']");
    By os = By.xpath("//input[@id='product_attribute_4_9']");
    By microsoft = By.xpath("//input[@id='product_attribute_5_10']");
    By total = By.xpath("//input[@id='product_attribute_5_12']");
//By verifyText = By.xpath("//span[@id='price-value-1']");
By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
By verifyText1 = By.xpath("//p[@class='content']");
By crossButton = By.xpath("//span[@title='Close']");
By shoppingCart = By.xpath("//span[@class='cart-label']");
By goToCart = By.cssSelector(".button-1.cart-button");

    public void clickOnProcessor(){
        mouseHoverToElementAndClick(processor);
    }
    public void selectProcessor(){
        selectByIndexFromDropDown(selectProcessor,1);
    }
    public void clickOnRam(){
        mouseHoverToElementAndClick(ram);
    }
    public void selectOnRam(){
        selectByIndexFromDropDown(selectRam,3);

    }
    public void clickOnHdd(){
        mouseHoverToElementAndClick(hdd);
    }
    public void clickOnOs(){
        mouseHoverToElementAndClick(os);
    }
    public void clickOnMicrosoft(){
        mouseHoverToElementAndClick(microsoft);
    }
    public void clickOnTotal(){
        mouseHoverToElementAndClick(total);
    }
   // public String getPriceText(){
       // return getTextFromElement($1,465.00);

    //}



    public void clickOnAddToCart(){
        mouseHoverToElementAndClick(addToCart);
    }
    public String verifyText1(){
        return getTextFromElement(verifyText1);

    }
    public void clickOnCrossButton(){
        mouseHoverToElementAndClick(crossButton);
    }
public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCart);
}
public void clickOnGoToCart(){
        mouseHoverToElementAndClick(goToCart);
}
}
