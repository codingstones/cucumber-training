package com.codingstones.bdd.sample5.bichomania.pages;

import org.openqa.selenium.WebDriver;

public class Page {
    protected WebDriver webDriver;

    public Page(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public Cart goToCart(){
        webDriver.get("http://www.bichomania.es/cart");
        return new Cart(webDriver);
    }
}
