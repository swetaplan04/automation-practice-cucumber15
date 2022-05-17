package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {

    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailAddressField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[@id='SubmitLogin']")
    WebElement signInButtonField;
    @CacheLookup
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement accountbuttonField;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationText;
    @CacheLookup
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createAnAccountText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
    WebElement errorMsg;
    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement registerEmail;

    public void setRegisterEmail(String email) {
        sendTextToElement(registerEmail, email);
        log.info("Enter email" + email + " to  field " + registerEmail.toString() + "<br>");
    }

    public void setEmailAddressField(String emailaddressfield) {
        sendTextToElement(emailAddressField, emailaddressfield);
        log.info("Enter email" + emailaddressfield + " to  field " + emailAddressField.toString() + "<br>");
    }

    public void setPasswordField(String passwordfield) {
        sendTextToElement(passwordField, passwordfield);
        log.info("Enter passwordfield" + passwordfield + " to  field " + passwordField.toString() + "<br>");
    }

    public void clickOnSignIn() {
        clickOnElement(signInButtonField);
        log.info("Clicking on signInButtonField" + signInButtonField.toString() + "<br>");
    }

    public String clickOnSignInText() {
        log.info("getting  text from signInButtonField" + signInButtonField.toString() + "<br>");
        return getTextFromElement(signInButtonField);
    }

    public void clickOnAccountButton() {
        clickOnElement(accountbuttonField);
        log.info("Clicking on accountbuttonField" + accountbuttonField.toString() + "<br>");
    }

    public String getAuthenticationText1() {
        log.info("getting  text from authenticationText" + authenticationText.toString() + "<br>");
        return getTextFromElement(authenticationText);
    }

    public String getCreateAcoountText() {
        log.info("getting  text from createAnAccountText" + createAnAccountText.toString() + "<br>");
        return getTextFromElement(createAnAccountText);
    }

    public void sinInToApplication(String username, String password) {
        setEmailAddressField(username);
        setPasswordField(password);
        clickOnSignIn();
    }

    public String geterrorMsg() {
        log.info("getting  text from errorMsg" + errorMsg.toString() + "<br>");
        return getTextFromElement(errorMsg);
    }

}
