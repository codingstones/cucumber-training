package com.codingstones.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/features" },
        features = "classpath:features/webapp/calculator.feature"
)

public class RunWebAppTest {
}
