package com.codingstones.bdd.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BrowserDriver {
    private static WebDriver webDriver;

    public static WebDriver getCurrentDriver() {
        if (webDriver == null) {
            System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver-mac");
            webDriver = new FirefoxDriver(new FirefoxProfile());
        }
        return webDriver;
    }

    public static void close() {
        getCurrentDriver().quit();
        webDriver = null;
    }
}
