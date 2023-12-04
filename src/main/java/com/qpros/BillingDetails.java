package com.qpros;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillingDetails extends BasePage{
    private final By billingDetailsDisplayed =By.xpath("//*[text()='Billing Details']");
    private final By firstNameDisplay =By.xpath("//label[@for='billing_first_name']");
    private final By secondNameDisplay =By.xpath("//label[@for='billing_last_name']");
    private final By companyDisplay =By.xpath ("//label[@for='billing_company']");

    private final By emailDisplay =By.xpath("//label[@for='billing_email']");
    private final By phoneDisplay =By.xpath ("//*[@name='billing_phone']");
    private final By billing_country =By.xpath ("//*[@for='billing_country']");
    private final By addressDisplay =By.xpath ("//*[@for='billing_address_1']");
    private final By townDisplay =By.xpath ("//*[@for='billing_city']");
    private final By stateDisplay =By.xpath ("//*[@for='billing_state']");
    private final By zipDisplay =By.xpath("//*[@for='billing_postcode']");

    public BillingDetails(WebDriver driver) {
        super(driver);
    }

        public boolean checkBillingDetails(){
            waitForVisibility(billingDetailsDisplayed);
            return isDisplayed(billingDetailsDisplayed);
        }


        public boolean firstNameCheck(){
            //waitForVisibility(billingDetailsDisplayed);
            return isDisplayed(firstNameDisplay);
        }
        public boolean secondNameCheck(){
            return isDisplayed(secondNameDisplay);
        }

        public boolean companyNameCheck(){
            return isDisplayed(companyDisplay);
        }
        public boolean emailCheck(){
            return isDisplayed(emailDisplay);
        }
        public boolean phoneCheck(){
            return isDisplayed(phoneDisplay);
        }
        public boolean countryCheck(){
            return isDisplayed(billing_country);
        }
        public boolean addressCheck(){
            return isDisplayed(addressDisplay);
        }
        public boolean townCheck(){
            return isDisplayed(townDisplay);
        }
        public boolean stateCheck(){
            return isDisplayed(stateDisplay);
        }
        public boolean zipCodeCheck(){
            return isDisplayed(zipDisplay);
        }



}
