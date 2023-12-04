package com.qpros;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BookTest extends BaseTest {
    private HomePage page;
    private ShoppingCart cart;
    BillingDetails billingDetails;
    SoftAssert softAssert =new SoftAssert();
    @Test
    public void selectBook() {

        page = new HomePage(getDriver());

        softAssert.assertTrue(page.isBookNameDisplayed());
        softAssert.assertTrue(page.isBookPriceDisplayed());

        softAssert.assertEquals(page.getBookName(), "Thinking in HTML");


    }

    @Test(dependsOnMethods = "selectBook")
    public void addToCart() {
        cart =new ShoppingCart(getDriver());
        page.clickAddToBasket();
        page.clickAddToCart();
        softAssert.assertTrue( cart.checkProductTitle());
        softAssert.assertTrue(cart.checkProductPrice());
        softAssert.assertTrue(cart.checkProductQuantity());
        softAssert.assertTrue( cart.checkProductTotal());


    }

    @Test(dependsOnMethods = "addToCart")
    public void assertBillingDetails()  {
        billingDetails =new BillingDetails(getDriver());

        cart.clickProceedToCheckout();
        softAssert.assertTrue(billingDetails.checkBillingDetails());
        softAssert.assertTrue(billingDetails.firstNameCheck());
        softAssert.assertTrue(billingDetails.secondNameCheck());
        softAssert.assertTrue(billingDetails.companyNameCheck());
        softAssert.assertTrue(billingDetails.emailCheck());
        softAssert.assertTrue(billingDetails.phoneCheck());
        softAssert.assertTrue(billingDetails.countryCheck());
        softAssert.assertTrue(billingDetails.addressCheck());
        softAssert.assertTrue(billingDetails.townCheck());
        softAssert.assertTrue(billingDetails.stateCheck());
        softAssert.assertTrue(billingDetails.zipCodeCheck());
        softAssert.assertAll();
    }


}
