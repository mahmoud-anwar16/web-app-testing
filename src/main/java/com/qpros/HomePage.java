package com.qpros;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final By bookNameTxt = By.xpath("//*[text()='Thinking in HTML']");
    private final By bookPriceTxt = By.xpath("//*[text()='400.00']");
    private final By addToBasketBtn = By.xpath("//a[@data-product_id='163']");
    private final By addToCart=By.xpath("//a[@class='added_to_cart wc-forward']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isBookNameDisplayed() {
        return isDisplayed(bookNameTxt);
    }

    public boolean isBookPriceDisplayed() {
        return isDisplayed(bookPriceTxt);
    }

    public String getBookName() {
        return getElementText(bookNameTxt);
    }

    public void clickAddToBasket() {
        waitForVisibility(addToBasketBtn);
        clickElement(addToBasketBtn);
    }
    public void clickAddToCart(){
        waitForVisibility(addToCart);
        clickElement(addToCart);
    }












}
