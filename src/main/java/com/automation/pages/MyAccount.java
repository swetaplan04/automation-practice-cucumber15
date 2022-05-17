package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount extends Utility {

    private static final Logger log = LogManager.getLogger(MyAccount.class.getName());

    public MyAccount() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement sinout;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myaccountText;


    public String clickOnsinOutText() {

        log.info("getting  text from sinout" + sinout.toString() + "<br>");
        return getTextFromElement(sinout);
    }

    public void clickOnSinOut() {

        clickOnElement(sinout);
        log.info("Clicking on sinout" + sinout.toString() + "<br>");
    }

    public String getMyAccountText() {

        log.info("getting  text from myaccountText " + myaccountText.toString() + "<br>");
        return getTextFromElement(myaccountText);
    }
}
