package com.codingstones.bdd.sample1.calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/features" },
        features = "classpath:features/sample1/calculator.feature"
)
public class RunCalculatorTest {
}