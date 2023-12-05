package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOut extends Utility {
    By firstName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By emailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryName = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By stateName  = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    By city = By.xpath("//input[@id='BillingNewAddress_City']");
    By address1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");




    public void sendFirstName(String FirstName){
        sendTextToElement(firstName,FirstName);
    }
    public void sendLastName(String LastName){
        sendTextToElement(lastName,LastName);
    }
    public void sendEmail(String Email){
        sendTextToElement(emailField,Email);
    }
    public void selectCountryByValue(String Value){
        selectByValueFromDropDown(countryName,Value);
    }
    public void selectStateByValue(String Value){
        selectByValueFromDropDown(stateName,Value);
    }
    public void sendaddress1(String Address){
        sendTextToElement(address1,Address);
    }
    public void sendCityName(String CityName){
        sendTextToElement(city,CityName);
    }
    public void sendPostalCode(String PostalCode){
        sendTextToElement(postalCode,PostalCode);
    }
    public void sendPhoneNumber(String PhoneNumber){
        sendTextToElement(phoneNumber,PhoneNumber);
    }
    public void clickOnContinueButton(){
        mouseHoverToElementAndClick(continueButton);
    }

}
