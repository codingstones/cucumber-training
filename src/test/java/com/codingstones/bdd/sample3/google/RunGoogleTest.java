package com.codingstones.bdd.sample3.google;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/features" },
        features = "classpath:features/sample3",
        tags = "@OK, @KO"
)

public class RunGoogleTest {
}
