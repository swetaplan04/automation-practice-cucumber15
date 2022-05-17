package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@title='Women']")
    WebElement womenTab;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[2]/a[1]")
    WebElement dressesTab;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement tshirtTab;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement sinInTab;
    @CacheLookup
    @FindBy(xpath = "//img[@class='logo img-responsive']")
    WebElement logoTab;

    public void clickOnWomenTab() {
        clickOnElement(womenTab);
        log.info("Clicking on womenTab" + womenTab.toString() + "<br>");
    }

    public void clickOnDressesTab() {
        clickOnElement(dressesTab);
        log.info("Clicking on dressesTab " + dressesTab.toString() + "<br>");
    }

    public void clickOnTshirtTab() {
        clickOnElement(tshirtTab);
        log.info("Clicking on tshirtTab " + tshirtTab.toString() + "<br>");
    }

    public void clickOnSinInTab() {
        clickOnElement(sinInTab);
        log.info("Clicking on sinInTab" + sinInTab.toString() + "<br>");
    }

    public void clickOnLogoTab() {
        clickOnElement(logoTab);
        log.info("Clicking on logoTab " + logoTab.toString() + "<br>");
    }
}

