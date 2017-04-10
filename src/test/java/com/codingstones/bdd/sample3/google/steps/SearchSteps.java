package com.codingstones.bdd.sample3.google.steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.fail;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchSteps {
    private WebDriver webDriver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver-mac");
        webDriver = new FirefoxDriver(new FirefoxProfile());
    }

    @After
    public void tearDown() {
        if(webDriver != null){
            webDriver.quit();
        }
    }

    @Given("^I am in \"(.*?)\"$")
    public void i_am_in(String url) throws Throwable {
        webDriver.get(url);
    }

    @Given("^I fill \"(.*?)\" field with \"(.*?)\"$")
    public void i_fill_field_with(String fieldName, String value) throws Throwable {
        WebElement field = webDriver.findElement(By.name(fieldName));
        field.sendKeys(value);
    }

    @When("^I click \"(.*?)\"$")
    public void i_click(String buttonText) throws Throwable {
        WebElement button = webDriver.findElement(By.cssSelector("button[value="+buttonText+"]"));
        button.click();
    }

    @Then("^some results are presented in the page$")
    public void some_results_are_presented_in_the_page() throws Throwable {
        WebDriverWait wait = new WebDriverWait(webDriver, 3);
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resultStats")));
        }catch (TimeoutException exception){
            fail("No results in the page");
        }
    }

    @Then("^\"(.*?)\" message is in the page$")
    public void are_presented_in_the_page(String text) throws Throwable {
        WebDriverWait wait = new WebDriverWait(webDriver, 3);
        try {
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("body"), text));
        }catch (TimeoutException exception){
            fail(text + " not found in the page");
        }

    }
}
