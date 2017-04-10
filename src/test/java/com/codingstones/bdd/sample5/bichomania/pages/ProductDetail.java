package com.codingstones.bdd.sample5.bichomania.pages;

import com.codingstones.bdd.utils.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetail extends Page{
    public ProductDetail(WebDriver webDriver) {
        super(webDriver);
    }

    public Cart addToCart(){
        WebDriverWait wait = new WebDriverWait(BrowserDriver.getCurrentDriver(), 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button")));
        WebElement addToCart = BrowserDriver.getCurrentDriver().findElement(By.id("add-to-cart-button"));
        addToCart.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("line_items")));
        return new Cart(webDriver);
    }
}
