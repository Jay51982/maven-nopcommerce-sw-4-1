package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputersTest extends TestBase {
    DesktopPage desktopPage = new DesktopPage();
    HomePage homePage = new HomePage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    CheckoutPage checkoutPage = new CheckoutPage();


    @Test
    public void testName() {
       // 1.1 Click on Computer Menu.
        homePage.clickOnComputer();
        //1.2 Click on Desktop
        homePage.clickOnDeskTop();
        //1.3 Select Sort By position "Name: Z to A"
        desktopPage.clickOnSortByZtoA();
        //1.4 Verify the Product will arrange in Descending order.
        desktopPage.getVerifyDescendingOrder();
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //2.1 Click on Computer Menu
        homePage.clickOnComputer();
        //2.2 Click on Desktop
        Thread.sleep(1000);
        homePage.clickOnDeskTop();
        //2.3 Select Sort By position "Name: A to Z"
        desktopPage.clickOnSortByAtoZ();
        //2.4 Click on "Add To Cart"
        Thread.sleep(1000);
        //2.5 Verify the Text "Build your own computer"
        desktopPage.clickBuildYourOwnComputer();
        Assert.assertEquals("Build your own computer", buildYourOwnComputerPage.verifyHeaderMessage());
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectProcessor();
        //2.7.Select "8GB [+$60.00]" using Select class
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectRAM();
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputerPage.selectHDD();
        // 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        Thread.sleep(1000);
        buildYourOwnComputerPage.selectOS();
        buildYourOwnComputerPage.selectSoftwareTotalCommander();
        //2.11 Verify the price "$1,475.00"
        Thread.sleep(1000);
        Assert.assertEquals("$1,475.00", buildYourOwnComputerPage.getVerifyPrice());
        //2.12 Click on "ADD TO CART" Button.
        buildYourOwnComputerPage.clickOnAddToCart();
        Thread.sleep(1000);
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        buildYourOwnComputerPage.getVerifyConfirmationText();
        buildYourOwnComputerPage.clickCloseAlert();

        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        Thread.sleep(1000);
        buildYourOwnComputerPage.hoverOnShoppingCart();
        //2.15 Verify the message "Shopping cart"

        Thread.sleep(1000);
        buildYourOwnComputerPage.clickOnGoToCart();
        Assert.assertEquals("Shopping cart", shoppingPage.getVerifyTextShoppingCart());
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        Thread.sleep(1000);
        shoppingPage.getAddQuantity();
        shoppingPage.clickOnUpdateCart();
        //2.17 Verify the Total"$2,950.00"
        Thread.sleep(1000);
        Assert.assertEquals("$2,950.00", shoppingPage.getVerifySubTotal());
        //2.18 click on checkbox “I agree with the terms of service”
        Thread.sleep(1000);
        shoppingPage.clickOnCheckBox();
        //2.19 Click on “CHECKOUT”
        shoppingPage.clickOnCheckOut();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        Thread.sleep(1000);
        Assert.assertEquals("Welcome, Please Sign In!", shoppingPage.getWelcomeMessage());
        //2.21Click on “CHECKOUT AS GUEST” Tab
        shoppingPage.clickOnCheckOutAsGuest();

        //2.22 Fill the all mandatory field
        Thread.sleep(1000);
        checkoutPage.enterFirstName();
        checkoutPage.enterLastName();
        checkoutPage.enterEmail();
        checkoutPage.enterCountry();
        checkoutPage.enterCity();
        Thread.sleep(1000);
        checkoutPage.enterAddress1();
        checkoutPage.enterZipPostalCode();
        checkoutPage.enterPhoneNumber();
        Thread.sleep(1000);
        checkoutPage.clickOnContinue();
        checkoutPage.clickNextDayAir();
        checkoutPage.clickOnContinueAir();
        Thread.sleep(1000);
        checkoutPage.clickOnCreditCard();
        checkoutPage.clickOnContinueCard();
        checkoutPage.selectMasterCard();
        Thread.sleep(1000);
        checkoutPage.enterCardHolderName();
        checkoutPage.enterCardNumber();
        checkoutPage.enterExpiryMonth();
        Thread.sleep(1000);
        checkoutPage.enterExpiryYear();
        checkoutPage.enterCardCode();
        checkoutPage.clickOnContinueCheckout();
        Thread.sleep(1000);
        Assert.assertEquals("Credit Card", checkoutPage.getVerifyCreditCardMethod());
        Thread.sleep(1000);
        Assert.assertEquals("Next Day Air", checkoutPage.getVerifyShippingMethod());
        Thread.sleep(1000);
        Assert.assertEquals("$2,950.00", checkoutPage.getVerifyTotal());

        checkoutPage.clickOnConfirm();
        Thread.sleep(1000);
        Assert.assertEquals("Thank you", checkoutPage.getVerifyThankYou());
        Thread.sleep(1000);
        Assert.assertEquals("Your order has been successfully processed!", checkoutPage.getVerifySuccessMessage());

        checkoutPage.clickOnContinueHomepage();
        Thread.sleep(1000);
        Assert.assertEquals("Welcome to our store", homePage.getVerifyWelcomeToStore());
    }
}
