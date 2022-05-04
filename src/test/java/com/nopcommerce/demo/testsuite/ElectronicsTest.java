package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    HomePage homePage = new HomePage();
    CheckoutPage checkoutPage = new CheckoutPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void textVerified() {
        //1.1 Mouse Hover on “Electronics” Tab
        homePage.hoverElectronics();
       //1.2 Mouse Hover on “Cell phones” and click
        homePage.clickCellPhones();
        //1.3 Verify the text “Cell phones”
        Assert.assertEquals("Cell phones", cellPhonesPage.getVerifyCellPhones());
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException{

        //2.1 Mouse Hover on “Electronics”Tab
        homePage.hoverElectronics();
        //2.2 Mouse Hover on “Cell phones” and click
        homePage.clickCellPhones();
        Thread.sleep(1000);
        //2.3 Verify the text “Cell phones”
        Assert.assertEquals("Cell phones", cellPhonesPage.getVerifyCellPhones());
        //2.4 Click on List View Tab
        Thread.sleep(1000);
        cellPhonesPage.clickListView();
        //2.5 Click on product name “Nokia Lumia 1020” link
        Thread.sleep(2000);
        cellPhonesPage.clickOnNokiaLumia();
        //2.6 Verify the text “Nokia Lumia 1020”
        Thread.sleep(1000);
        Assert.assertEquals("Nokia Lumia 1020", nokiaLumiaPage.getVerifyNokiaLumia());
        //2.7 Verify the price “$349.00”
        Thread.sleep(1000);
        Assert.assertEquals("$349.00", nokiaLumiaPage.getVerifyPrice());
        //2.8 Change quantity to 2
        nokiaLumiaPage.sendChangeQuantity2();
        //2.9 Click on “ADD TO CART” tab
        nokiaLumiaPage.clickAddToCart();
        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        //After that close the bar clicking on the cross button.
        Thread.sleep(1000);
        Assert.assertEquals("The product has been added to your shopping cart", nokiaLumiaPage.getVerifyProductAdded());
        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumiaPage.clickCloseAlert();
        //2.12 Verify the message "Shopping cart"
        Thread.sleep(1000);
        nokiaLumiaPage.clickShoppingCart();
        //2.13 Verify the quantity is 2
        Thread.sleep(1000);
        Assert.assertEquals("Shopping cart", shoppingPage.getVerifyShoppingCart());
        //2.14 Verify the Total $698.00
        Thread.sleep(1000);
        Assert.assertEquals("(2)", shoppingPage.getVerifyQuantity2());
    //2.15 click on checkbox “I agree with the terms of service”
        Thread.sleep(1000);
        Assert.assertEquals("$698.00", shoppingPage.getVerifyNokiaSubTotal());
    //2.16 Click on checkout
        shoppingPage.clickTermsOfService();
        Thread.sleep(1000);
        //2.17 Verify the Text “Welcome, Please Sign In!”
        shoppingPage.clickCheckOutNokia();
        //2.18 Click on “REGISTER” tab
        Thread.sleep(1000);
        Assert.assertEquals("Welcome, Please Sign In!", registerPage.getVerifyWelcomeMessage());
        //2.19 Verify the text “Register”
        registerPage.clickRegister();
        //2.20 Fill the mandatory fields
        Thread.sleep(1000);
        Assert.assertEquals("Register", registerPage.getVerifyRegister());
        registerPage.enterFirstName();
        registerPage.enterLastName();
        registerPage.enterEmail();
        registerPage.enterPassword();
        registerPage.enterConfirmPassword();
        //2.21 Click on “REGISTER” Button
        registerPage.clickRegisterButton();
        //2.22 Verify the message “Your registration completed”
        Thread.sleep(1000);
        Assert.assertEquals("Your registration completed", registerPage.getVerifyRegistrationCompleted());
        //2.23 Click on “CONTINUE” tab
        registerPage.clickContinueShopping();
        //2.24 Verify the text “Shopping cart”
        Thread.sleep(1000);
        Assert.assertEquals("Shopping cart", shoppingPage.getVerifyNokiaShoppingCart());
        //2.25 click on checkbox “I agree with the terms of service”
        shoppingPage.clickTermsOfServiceNokia();
        shoppingPage.clickCheckOutNokiaShopping();
        //2.27 Fill the Mandatory fields
        Thread.sleep(1000);
        checkoutPage.selectCountryIdFieldNokia();
        checkoutPage.enterCityFieldNokia();
        checkoutPage.enterAddressField1Nokia();
        checkoutPage.enterZipCodeNokia();
        checkoutPage.enterPhoneNumberNokia();
        //2.28 Click on “CONTINUE”
        Thread.sleep(1000);
        checkoutPage.clickContinueAirNokia();
        checkoutPage.clickDayAir2nd();
        checkoutPage.clickContinueCardNokia();
        checkoutPage.clickCreditCardNokia();
        checkoutPage.clickContinueCardDetailsNokia();
        checkoutPage.selectVisa();
        Thread.sleep(1000);
        //2.33 Fill all the details
        checkoutPage.enterCardHolderNameNokia();
        checkoutPage.enterCardNumberNokia();
        checkoutPage.enterExpiryMonthNokia();
        checkoutPage.enterExpiryMonthNokia();
        checkoutPage.enterExpiryYearNokia();
        checkoutPage.enterCardCodeNokia();
        //2.34 Click on “CONTINUE”CHECKOUT”
        Thread.sleep(1000);
        checkoutPage.clickOnContinueCheckoutNokia();
        //2.35 Verify “Payment Method” is “Credit Card”
        Thread.sleep(1000);
        Assert.assertEquals("Credit Card", checkoutPage.getVerifyCreditCardMethodNokia());
        //2.36 Verify “Shipping Method” is “2nd Day Air”
        Thread.sleep(1000);
        Assert.assertEquals("2nd Day Air", checkoutPage.getVerifyShippingMethodNokia());
        //2.37 Verify Total is “$698.00”
        Thread.sleep(1000);
        Assert.assertEquals("$698.00", checkoutPage.getVerifyTotalNokia());
    //2.38 Click on “CONFIRM”
        checkoutPage.clickOnConfirmNokia();
        //2.39 Verify the Text “Thank You”
        Thread.sleep(1000);
        Assert.assertEquals("Thank you", checkoutPage.getVerifyThankYouNokia());
    //  2.40 Verify the message “Your order has been successfully processed!”
        Thread.sleep(1000);
        Assert.assertEquals("Your order has been successfully processed!", checkoutPage.getVerifySuccessMessageNokia());
        //  2.41 Click on “CONTINUE”
        checkoutPage.clickOnContinueHomepageNokia();
        //2.42 Verify the text “Welcome to our store”
        Thread.sleep(1000);
        Assert.assertEquals("Welcome to our store", homePage.getVerifyWelcomeToStore());
        //2.43 Click on “Logout” link
        homePage.clickOnLogOut();

    }
}
