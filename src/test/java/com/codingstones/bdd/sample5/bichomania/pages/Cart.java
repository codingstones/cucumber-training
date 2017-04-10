package com.codingstones.bdd.sample5.bichomania.pages;

import com.codingstones.bdd.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class Cart extends Page {
    public Cart(WebDriver webDriver) {
        super(webDriver);
    }

    public Boolean isEmpty(){
        List lineItems = BrowserDriver.getCurrentDriver().findElements(By.id("line_items"));
        return lineItems.size() == 0;
    }
}
