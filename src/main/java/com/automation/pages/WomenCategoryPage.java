package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCategoryPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womenTab;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Women')]")
    WebElement womenText;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement topsLink;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement dressesLink;
    @CacheLookup
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortBydropdown;
    @CacheLookup
    @FindBy(xpath = "//i[@class='icon-th-list']")
    WebElement productsList;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]")
    WebElement blouse;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedDress;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Printed Chiffon Dress')]")
    WebElement printedChiffonDress;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedSummerDresswithPrice$28;


    public void getWomen() {
        log.info("Clicking on Women" + womenTab.toString() + "<br>");
        clickOnElement(womenTab);
    }

    public String getWomenText() {
        log.info("getting  text from womenText " + womenText.toString() + "<br>");
        return getTextFromElement(womenText);
    }

    public void clickOnTops() {
        clickOnElement(topsLink);
        log.info("Clicking on Tops " + topsLink.toString() + "<br>");
    }

    public void clickOnDresses() {
        clickOnElement(dressesLink);
        log.info("Clicking on Dresses" + dressesLink.toString() + "<br>");
    }

    public void selectFromDropDown(String option) {
        selectByValueFromDropDown(sortBydropdown, option);
        log.info("Selecting dropdowm" + option + " from dropdown " + sortBydropdown.toString() + "<br>");
    }

    public void clickOnProductList() {
        clickOnElement(productsList);
        log.info("Clicking on ProductList" + productsList.toString() + "<br>");
    }

    public void mouseHoverOnProduct() {
        mouseHoverToElement(productsList);
    }

    public void selectProduct(String text) {

        if (text.equalsIgnoreCase("Blouse")) {
            clickOnElement(blouse);
            log.info("Clicking on Blouse " + blouse.toString());
        }

        if (text.equalsIgnoreCase("Printed Dress")) {
            clickOnElement(printedDress);
            log.info("Clicking on Printed Dress " + printedDress.toString());
        }
        if (text.equalsIgnoreCase("Printed Chiffon Dress")) {
            clickOnElement(printedChiffonDress);
            log.info("Clicking on Printed Chiffon Dress " + printedChiffonDress.toString());
        }
        if (text.equalsIgnoreCase("Printed Summer Dress with Price $28.98")) {
            clickOnElement(printedSummerDresswithPrice$28);
            log.info("Clicking on Printed Summer Dress with Price tag $28.98 " + printedSummerDresswithPrice$28.toString());
        }
    }
}


