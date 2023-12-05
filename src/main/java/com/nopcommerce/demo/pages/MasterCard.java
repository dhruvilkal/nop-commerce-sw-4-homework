package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class MasterCard extends Utility {
    By selectCreditCard = By.xpath("//select[@id='CreditCardType']");
    By masterCardByValue = By.xpath("//select[@id='CreditCardType']");
By cardHolderName = By.xpath("//input[@id='CardholderName']");
By cardNumber = By.xpath("//input[@id='CardNumber']");
By month = By.xpath("//select[@id='ExpireMonth']");
By selectMonthByValue = By.xpath("//select[@id='ExpireMonth']");
By year = By.xpath("//select[@id='ExpireMonth']");
By selectYearByValue = By.xpath("//select[@id='ExpireYear']");
By cardCod = By.xpath("//input[@id='CardCode']");
By continueButton3 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");








    public void clickOnSelectCreditCard(){
        mouseHoverToElementAndClick(selectCreditCard);
    }
    public void selectMasterCardByValue (String Value){
        selectByValueFromDropDown(masterCardByValue,Value);
    }
    public void sendCardHolderName(String CardHolderName){
        sendTextToElement(cardHolderName,CardHolderName);
    }
    public void sendCardNumber(String CardNumber){
        sendTextToElement(cardNumber, CardNumber);
    }
    public void selectMonthByValue (String Value){
        selectByValueFromDropDown(selectMonthByValue,Value);
    }
    public void selectSelectYearByValue (String Value){
        selectByValueFromDropDown(selectYearByValue,Value);
    }
    public void sendCardCod(String CardCode){
        sendTextToElement(cardCod,CardCode);
    }
    public void clickOnContinueButton3(){
        mouseHoverToElementAndClick(continueButton3);
    }
}
