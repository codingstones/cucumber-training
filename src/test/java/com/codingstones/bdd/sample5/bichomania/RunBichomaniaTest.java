package com.codingstones.bdd.sample5.bichomania;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/features" },
        features = "classpath:features/sample5"
)
public class RunBichomaniaTest {
}
