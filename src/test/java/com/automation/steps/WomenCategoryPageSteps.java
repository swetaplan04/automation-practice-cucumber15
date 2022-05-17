package com.automation.steps;

import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class WomenCategoryPageSteps {
    @When("^User click on women tab$")
    public void userClickOnWomenTab() {
        new WomenCategoryPage().getWomen();
    }

    @Then("^User can see \"([^\"]*)\" text$")
    public void userCanSeeText(String women) {
        Assert.assertEquals("", women, new WomenCategoryPage().getWomenText());

    }

    @And("^User click on \"([^\"]*)\" from product$")
    public void userClickOnFromProduct(String product) {
        new WomenCategoryPage().selectProduct(product);

    }

    @And("^User click on \"([^\"]*)\" from qty$")
    public void userClickOnFromQty(String qty) {
        new ProductPage().clearqty();
        new ProductPage().setProductQuantity(qty);

    }

    @And("^User click on \"([^\"]*)\" from size$")
    public void userClickOnFromSize(String size) {
        new ProductPage().setProductSize(size);

    }

    @And("^User click on \"([^\"]*)\" from colour$")
    public void userClickOnFromColour(String color) {
        new ProductPage().setProductcolour(color);

    }

    @And("^User click on add to cart button$")
    public void userClickOnAddToCartButton() {
        new ProductPage().setAddToCardProduct();
    }

    @Then("^User can see message\"([^\"]*)\"product added$")
    public void userCanSeeMessageProductAdded(String messagetext) {
        try {
            Thread.sleep(50000);
            Assert.assertEquals("", messagetext, new ProductPage().getProductAddedText());
        } catch (Exception e) {
            //
        }
    }


    @And("^User close popup window$")
    public void userClosePopupWindow() {
        new ProductPage().canclecrossbutton();
    }
}
