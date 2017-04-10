package com.codingstones.bdd.sample5.bichomania.steps;

import com.codingstones.bdd.utils.BrowserDriver;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CartSteps {

    @After
    public void tearDown() {
        BrowserDriver.close();
    }

    @Given("^an empty cart$")
    public void an_empty_cart() throws Throwable {
        System.out.println("Well.. the cart is empty for each driver instance ;)");
    }

    @Given("^I am looking for a dog product$")
    public void i_am_looking_for_a_dog_product() throws Throwable {
        BrowserDriver.toUrl("http://www.bichomania.es/t/categorias/perros");
        WebElement productAnchor = BrowserDriver.getCurrentDriver().findElement(By.cssSelector("div.product-item a"));
        productAnchor.click();

    }

    @When("^I add the product to the cart$")
    public void i_add_the_product_to_the_cart() throws Throwable {
        WebDriverWait wait = new WebDriverWait(BrowserDriver.getCurrentDriver(), 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button")));
        WebElement addToCart = BrowserDriver.getCurrentDriver().findElement(By.id("add-to-cart-button"));
        addToCart.click();
    }

    @Then("^the product should be present in my cart$")
    public void the_product_should_be_present_in_my_cart() throws Throwable {
        WebDriverWait wait = new WebDriverWait(BrowserDriver.getCurrentDriver(), 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("line_items")));
        WebElement lineItems = BrowserDriver.getCurrentDriver().findElement(By.id("line_items"));
        List items = lineItems.findElements(By.className("line-item"));
        assertEquals(1, items.size());
    }
}
