package com.automation.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.MyAccount;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class CreateAccountPageSteps {
    @Given("^User should in home page$")
    public void userShouldInHomePage() {
    }

    @When("^User click on singin link$")
    public void userClickOnSinginLink() {
        new HomePage().clickOnSinInTab();
    }

    @And("^User enter email id \"([^\"]*)\"$")
    public void userEnterEmailId(String email)  {
        new SignInPage().setRegisterEmail(email);
    }

    @And("^User click on create an account button$")
    public void userClickOnCreateAnAccountButton() {
        new SignInPage().clickOnAccountButton();
    }

    @And("^User enter Title \"([^\"]*)\"$")
    public void userEnterTitle(String title)  {
        new CreateAccountPage().setTitle();
    }

    @And("^User enter First name  \"([^\"]*)\"$")
    public void userEnterFirstName(String firstname)  {
        new CreateAccountPage().setFirstname(firstname);

    }

    @And("^User enter Last name   \"([^\"]*)\"$")
    public void userEnterLastName(String lastname)  {
        new CreateAccountPage().setLastname(lastname);

    }

    @And("^User enter  Password \"([^\"]*)\"$")
    public void userEnterPassword(String password)  {
        new CreateAccountPage().setpassword(password);

    }

    @And("^User select DateofBirth \"([^\"]*)\"$")
    public void userSelectDateofBirth(String date)  {
        new CreateAccountPage().selectBirthDate(date);

    }

    @And("^User select MonthofBirth \"([^\"]*)\"$")
    public void userSelectMonthofBirth(String month)  {
        new CreateAccountPage().selectBirthMonth(month);

    }

    @And("^User select YearofBirth \"([^\"]*)\"$")
    public void userSelectYearofBirth(String year)  {
        new CreateAccountPage().selectBirthYear(year);

    }

    @And("^User click checkBoxnewsletter$")
    public void userClickCheckBoxnewsletter() {
        new CreateAccountPage().clicknewnewsletter();

    }

    @And("^User click checkBoxSpecialOffers$")
    public void userClickCheckBoxSpecialOffers() {
        new CreateAccountPage().clickonspecialoffer();
    }

    @And("^User enter AddressFirstname\"([^\"]*)\"$")
    public void userEnterAddressFirstname(String addfirstname)  {
        new CreateAccountPage().setAddressFirstname(addfirstname);


    }

    @And("^User enter AddressLastname \"([^\"]*)\"$")
    public void userEnterAddressLastname(String addlastname)  {
        new CreateAccountPage().setAddressLastname(addlastname);

    }

    @And("^User enter Address\"([^\"]*)\"$")
    public void userEnterAddress(String address)  {
        new CreateAccountPage().setAddress(address);

    }

    @And("^User enter AddressCity\"([^\"]*)\"$")
    public void userEnterAddressCity(String city)  {
        new CreateAccountPage().setCity(city);

    }

    @And("^User select AddressState \"([^\"]*)\"$")
    public void userSelectAddressState(String state)  {
        new CreateAccountPage().setState(state);

    }

    @And("^User enter AddressZip/PostalCode  \"([^\"]*)\"$")
    public void userEnterAddressZipPostalCode(String zipcode)  {
        new CreateAccountPage().setZipPostalCode(zipcode);

    }

    @And("^User select AddressCountry \"([^\"]*)\"$")
    public void userSelectAddressCountry(String addcontry)  {
        new CreateAccountPage().setCountry(addcontry);


    }

    @And("^User enter AddressMobile phone \"([^\"]*)\"$")
    public void userEnterAddressMobilePhone(String mobile)  {
        new CreateAccountPage().setMobilePhone(mobile);

    }

    @And("^User senter Address alias for future reference \"([^\"]*)\"$")
    public void userSenterAddressAliasForFutureReference(String reference)  {
        new CreateAccountPage().setAssignAnAddressaLiasForFutureReference(reference);

    }

    @And("^User click on register button$")
    public void userClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegister();

    }

    @Then("^User can see message\"([^\"]*)\"$")
    public void userCanSeeMessage(String message1)  {
        Assert.assertEquals("", message1, new MyAccount().getMyAccountText());

    }
}
