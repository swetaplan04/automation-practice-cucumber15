package com.automation.steps;

import com.automation.pages.MyAccount;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;


public class SignInSteps {
    @Then("^User can see text \"([^\"]*)\"$")
    public void userCanSeeText(String text)  {
        Assert.assertEquals("",text,new SignInPage().getAuthenticationText1());

    }

    @And("^User enter username \"([^\"]*)\"$")
    public void userEnterUsername(String username)  {
        new SignInPage().setEmailAddressField(username);

    }

    @And("^User enter password \"([^\"]*)\"$")
    public void userEnterPassword(String password)  {
        new SignInPage().setPasswordField(password);

    }

    @And("^User click on signIn button$")
    public void userClickOnSignInButton() {
        new SignInPage().clickOnSignIn();

    }

    @Then("^User can see error message \"([^\"]*)\"$")
    public void userCanSeeErrorMessage(String errormessage1)  {
        Assert.assertEquals("", errormessage1,new SignInPage().geterrorMsg());
    }

    @Then("^User can see sinout link \"([^\"]*)\"$")
    public void userCanSeeSinoutLink(String errormessage)  {
        Assert.assertEquals("",errormessage,new MyAccount().clickOnsinOutText());

    }

    @And("^User click on signout button$")
    public void userClickOnSignoutButton() {
        new MyAccount().clickOnSinOut();
    }

    @Then("^User can see signIn link \"([^\"]*)\"$")
    public void userCanSeeSignInLink(String errormessage3)  {
        Assert.assertEquals("",errormessage3,new SignInPage().clickOnSignInText());

    }
}
