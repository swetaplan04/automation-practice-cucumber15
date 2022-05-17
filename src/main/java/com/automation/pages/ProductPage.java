package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//select[@id='group_1']")
    WebElement productSize;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Color')]")
    WebElement productcolour;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCardProduct;
    @CacheLookup
    @FindBy(xpath = "//a[@title='White']")
    WebElement blousecolorWhite;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Orange']")
    WebElement printedDrescolorOrange;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Green']")
    WebElement PrintedChiffonDresscolorGreen;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Blue']")
    WebElement PrintedSummerDresswithPrice$2898colorBlue;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")//"/div[@class='layer_cart_product col-xs-12 col-md-6']")
    WebElement productAdded;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
    WebElement crossbutton;


    public void clearqty(){
        sendTextToElementclear(quantity);
    }

    public void setProductQuantity(String qty) {
        sendTextToElement(quantity, qty);
        log.info("Enter ProductQuantity " + qty + " to firstname field " + quantity.toString() + "<br>");
    }

    public void setProductSize(String size) {
        selectByVisibleTextFromDropDown(productSize, size);
        log.info("Selecting birthDate " + size + " from dropdown " + productSize.toString() + "<br>");
    }

    public void setProductcolour(String colour) {
        if (colour == "White") {
            clickOnElement(blousecolorWhite);
            log.info("Clicking on White" + blousecolorWhite.toString() + "<br>");
        } else if (colour == "Orange") {
            clickOnElement(printedDrescolorOrange);
            log.info("Clicking on Orange" + printedDrescolorOrange.toString() + "<br>");
        } else if (colour == "Green") {
            clickOnElement(PrintedChiffonDresscolorGreen);
            log.info("Clicking on Green" + PrintedChiffonDresscolorGreen.toString() + "<br>");
        } else if (colour == "Blue") {
            clickOnElement(PrintedSummerDresswithPrice$2898colorBlue);
            log.info("Clicking on Blue" + PrintedSummerDresswithPrice$2898colorBlue.toString() + "<br>");
        }
    }

    public void setAddToCardProduct() {
        clickOnElement(addToCardProduct);
        log.info("Clicking on addToCardProduct" + addToCardProduct.toString() + "<br>");
    }

    public String getProductAddedText() {
        log.info("getting  text from productAdded" + productAdded.toString() + "<br>");
        return getTextFromElement(productAdded);
    }

    public void canclecrossbutton() {
        clickOnElement(crossbutton);
        log.info("Clicking on crossbutton" + crossbutton.toString() + "<br>");
    }
}

