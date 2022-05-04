package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {
    By sortByZtoA = By.xpath("//option[contains(text(),'Name: Z to A')]");
    By verifyDescendingOrder = By.xpath("//option[contains(text(),'Name: Z to A')]");
    By sortByAtoZ = By.xpath("//option[contains(text(),'Name: A to Z')]");
    By buildYourOwnComputer = By.xpath("(//button[@type='button'][normalize-space()='Add to cart'])[1]");

    public void clickOnSortByZtoA() {
        clickOnElement(sortByZtoA);
    }

    public String getVerifyDescendingOrder() {
        return getTextFromElement(verifyDescendingOrder);
    }

    public void clickOnSortByAtoZ() {
        clickOnElement(sortByAtoZ);
    }
    public void clickBuildYourOwnComputer (){
        clickOnElement(buildYourOwnComputer);
    }


}
