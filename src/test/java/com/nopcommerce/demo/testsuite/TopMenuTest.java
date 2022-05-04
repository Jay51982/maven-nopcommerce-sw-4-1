package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenuPage topMenu = new TopMenuPage();

    @Test
    public void VerifyPageNavigation() {
        topMenu.clickOnComputerTab();
        Assert.assertEquals("Computers", topMenu.getVerifyComputerTab());
        topMenu.clickOnElectronicsTab();
        Assert.assertEquals("Electronics", topMenu.getVerifyElectronicsTab());
        topMenu.clickOnApparelTab();
        Assert.assertEquals("Apparel", topMenu.getVerifyApparelTab());
        topMenu.clickOnDigitalDownloadsTab();
        Assert.assertEquals("Digital downloads", topMenu.getVerifyDigitalDownloadsTab());
        topMenu.clickOnBooksTab();
        Assert.assertEquals("Books", topMenu.getVerifyBooksTab());
        topMenu.clickOnJewelryTab();
        Assert.assertEquals("Jewelry", topMenu.getVerifyJewelryTab());
        topMenu.clickOnGiftCardTab();
        Assert.assertEquals("Gift Cards", topMenu.getVerifyGiftCardTab());
    }

}
