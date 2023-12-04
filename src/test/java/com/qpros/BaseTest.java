package com.qpros;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    private ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private String baseURL = "https://practice.automationtesting.in/";

    @BeforeClass
    @Parameters({"browser"})
    public void setup(@Optional("chrome") String browser) throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setBrowserName(browser);// Initialize ThreadLocal driver instance
        driver.set(new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), desiredCapabilities));


        getDriver().manage().window().maximize();
        getDriver().navigate().to(baseURL);
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterClass
    public void tearDown() {
        getDriver().quit();
        driver.remove();
    }

}
