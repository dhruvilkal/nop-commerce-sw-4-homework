package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {
    By sortByPosition = By.xpath("//select[@id='products-orderby']");
    //Select Sort By position "Name: Z to A"
    By shortByZToA = By.xpath("//select[@id='products-orderby']");

    // select sort By position "Name: A to Z"
    By shortByAToZ = By.xpath("//select[@id='products-orderby']");
    By addToCart = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");





public void sortByPosition(){
         mouseHoverToElementAndClick(sortByPosition);

    }
    public void nameZToA(){
        mouseHoverToElementAndClick(shortByZToA);

}
    // select filter A to Z
    public void selectFilterAToZ(String shortByValue){
        selectByValueFromDropDown(shortByAToZ,shortByValue);
    }
public void addToCart(){
    mouseHoverToElementAndClick(addToCart);
}







}
