package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.jvm.hotspot.utilities.Assert;

public class ComputerTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
     BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
     ShoppingCart shoppingCart = new ShoppingCart();
     CheckOutAsGuest checkOutAsGuest =new CheckOutAsGuest();
     CheckOut checkOut = new CheckOut();
     CheckOutPageBilling checkOutPageBilling = new CheckOutPageBilling();
     MasterCard masterCard = new MasterCard();
     ConfirmOrder confirmOrder =new ConfirmOrder();
     Completed completed = new Completed();
@Test
    public void verifyProductArrangeInAlphabeticalOrder(){
        homePage.clickOnComputers();
        homePage.clickOnDesktops();
        desktopsPage.sortByPosition();
        desktopsPage.nameZToA();

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputers();
        homePage.clickOnDesktops();
        desktopsPage.addToCart();
        buildYourOwnComputer.clickOnProcessor();
        buildYourOwnComputer.selectProcessor();
        buildYourOwnComputer.clickOnRam();
        buildYourOwnComputer.selectOnRam();
        buildYourOwnComputer.clickOnHdd();
        buildYourOwnComputer.clickOnOs();
        buildYourOwnComputer.clickOnMicrosoft();
        buildYourOwnComputer.clickOnTotal();
      //  String expectedText = "$1,465.00";
      //  String actualText = buildYourOwnComputer.verifyText();
     //   Assert.assertEquals(actualText, expectedText);
        buildYourOwnComputer.clickOnAddToCart();
        //  String expectedText = "The product has been added to your shopping cart";
          //  String actualText = buildYourOwnComputer.verifyText1();
        //Assert.assertEquals(actualText, expectedText);
        buildYourOwnComputer.clickOnCrossButton();
        buildYourOwnComputer.mouseHoverOnShoppingCart();
        Thread.sleep(2000);
        buildYourOwnComputer.clickOnGoToCart();
        shoppingCart.getVerifyTextShoppingCart();
        shoppingCart.clickOnQtyBox();
        Thread.sleep(2000);
        shoppingCart.clearQuantityBox();
        shoppingCart.sendQtyInBox("2");
        shoppingCart.clickOnUpdateShoppingCart();

        //Verify the Total"$2,950.00"
        String expectedText4 = "$2,950.00";
        String actualText4 = shoppingCart.getTotalText();
        Assert.assertEquals(actualText4,expectedText4);

        shoppingCart.clickOnCheckBox();

        shoppingCart.clickOnCheckOut();

//2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedText5 = "Welcome, Please Sign In!";
        String actualText5 = checkOutAsGuest.getVerifyTextWelcome();
        Assert.assertEquals(expectedText5,actualText5);

        // clickOnCheckOutASguest
        checkOutAsGuest.clickOnCheckOutAsGuest();

        // FirstName
        checkOut.sendFirstName("Mohan");
        //LastName
        checkOut.sendLastName("Patel");
        //Email
        checkOut.sendEmail("mohan123@gmail.com");
        //Country
        checkOut.selectCountryByValue("2");
        //State
        checkOut.selectStateByValue("53");
        //Adress
        checkOut.sendaddress1("BondStreet");
        //City
        checkOut.sendCityName("London");
        //PostalCode
        checkOut.sendPostalCode("HA3  7BM");
        //Phone Number
        checkOut.sendPhoneNumber("07587402063");

        // clickOn continue
        checkOut.clickOnContinueButton();

        checkOutPageBilling.clickOnNextDayAir();
        checkOutPageBilling.clickOnContinueButton();
      checkOutPageBilling.clickOnCreditCard();
      checkOutPageBilling.clickOnContinueButton2();

      masterCard.clickOnSelectCreditCard();
      masterCard.selectMasterCardByValue("2" );
      masterCard.sendCardHolderName("manish");
      masterCard.sendCardNumber("5555 5555 5555 4444");
      masterCard.selectMonthByValue("2");
      masterCard.selectSelectYearByValue("3");
      masterCard.sendCardCod("021");
      masterCard.clickOnContinueButton3();

        String expectedText6 = "Payment Method: Credit Card";
        String actualText6 = confirmOrder.getVerifyTextPaymentMethodCreditCard();
        Assert.assertEquals(expectedText6,actualText6);

        String expectedText7 = "Shipping Method: Next Day Air";
        String actualText7 = confirmOrder.getVerifyTextShippingMethodNextDayAir();
        Assert.assertEquals(expectedText7,actualText7);

        String expectedText8 = "$2,950.00";
        String actualText8 = confirmOrder.getVerifyTextTotalPrice();
        Assert.assertEquals(expectedText8,actualText8);


        confirmOrder.clickOnConfirm();


        String expectedText9 = "Thank you";
        String actualText9 = completed.getVerifyTextThankYou();
        Assert.assertEquals(expectedText9,actualText9);

        String expectedText10 = "Your order has been successfully processed!";
        String actualText10= completed.getVerifyYourOrderHasBeenSuccessfullyProcessed();
        Assert.assertEquals(expectedText9,actualText9);

        completed.clickOnContinueButton3();

        String expectedText11 = "Welcome to our store";
        String actualText11 = homePage.getVerifyTextWelcomeToOurStore();
        Assert.assertE(expectedText11,actualText11);






    }



}
