package com.codingstones.bdd.sample1.calculator.steps;

import com.codingstones.bdd.Calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CalculatorSteps {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Given("^I have a calculator$")
    public void i_have_a_calculator() throws Throwable {
        assertNotNull(calculator);
    }

    @When("^I add (\\d+) and (\\d+)$")
    public void i_add_and(int arg1, int arg2) throws Throwable {
        calculator.sum(arg1, arg2);
    }

    @Then("^the result is (\\d+)$")
    public void the_result_is(int arg1) throws Throwable {
        assertEquals(arg1, calculator.currentValue());
    }

    @When("^I substract (\\d+) and (\\d+)$")
    public void i_substract_and(int arg1, int arg2) throws Throwable {
        calculator.substract(arg1, arg2);
    }

}
