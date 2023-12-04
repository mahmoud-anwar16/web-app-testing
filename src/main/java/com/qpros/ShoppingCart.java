package com.qpros;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart extends BasePage{
    private final By productTitle = By.xpath("//*[@data-title=\"Product\"]");
    private final By productPrice=By.xpath("//*[@data-title=\"Price\"]");
    private final By productQuantity=By.xpath("//*[@type=\"number\"]");
    private final By productTotal =By.xpath("//td[@class=\"product-subtotal\"]");

    private final By proceedToCheckBtn =By.xpath("//*[@class='checkout-button button alt wc-forward']");

    public ShoppingCart(WebDriver driver) {
        super(driver);
    }

        public boolean checkProductTitle(){
            return isDisplayed(productTitle);
        }
        public boolean checkProductPrice(){
            return isDisplayed(productPrice);
        }
        public boolean checkProductQuantity(){
            return isDisplayed(productQuantity);
        }

        public boolean checkProductTotal(){
            return isDisplayed(productTotal);
        }
        public void clickProceedToCheckout(){
            waitForVisibility(proceedToCheckBtn);
            clickElement(proceedToCheckBtn);
        }
    }

