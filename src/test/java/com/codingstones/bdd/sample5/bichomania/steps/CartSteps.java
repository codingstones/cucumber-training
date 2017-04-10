package com.codingstones.bdd.sample5.bichomania.steps;

import com.codingstones.bdd.sample5.bichomania.pages.Cart;
import com.codingstones.bdd.sample5.bichomania.pages.Page;
import com.codingstones.bdd.sample5.bichomania.pages.ProductDetail;
import com.codingstones.bdd.sample5.bichomania.pages.ProductList;
import com.codingstones.bdd.utils.BrowserDriver;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CartSteps {
    ProductList productList;
    ProductDetail productDetail;
    Cart cart;

    @After
    public void tearDown() {
        BrowserDriver.close();
    }

    @Given("^an empty cart$")
    public void an_empty_cart() throws Throwable {
        System.out.println("Well.. the cart is empty for each driver instance ;)");
        cart = new Page(BrowserDriver.getCurrentDriver()).goToCart();
        assertTrue(cart.isEmpty());
    }

    @Given("^I am looking for a dog product$")
    public void i_am_looking_for_a_dog_product() throws Throwable {
        productList = new ProductList(BrowserDriver.getCurrentDriver());
        productDetail = productList.goToAProduct();
    }

    @When("^I add the product to the cart$")
    public void i_add_the_product_to_the_cart() throws Throwable {
        cart = productDetail.addToCart();
    }

    @Then("^the product should be present in my cart$")
    public void the_product_should_be_present_in_my_cart() throws Throwable {
        assertFalse(cart.isEmpty());
    }
}
